package com.example.backend.serviceimplements;

import com.example.backend.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.backend.entities.usuarios;
import java.util.ArrayList;
import java.util.List;

@Service
public class JwtUserDetailsService implements UserDetailsService{
    @Autowired
    private UsuariosRepository myRepo;

    /*@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Aqui lógica para buscar el usuario en BD
        //Usuario defecto web:password

        if ("web".equals(username)) {
            return new User("web", "$2a$12$CTtjF8P3IJVK6pP4w9pTxuldMqQRrfrLbLLIlasdu2K6ii2vWGly2",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
        }
    }*/
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        usuarios user = myRepo.findByUsername(username);

        if(user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }

        List<GrantedAuthority> roles = new ArrayList<>();

        user.getRoles().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getRol()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, roles);

        return ud;
    }
}
