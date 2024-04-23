package com.labdevweb.goeventapp.service;


import com.labdevweb.goeventapp.domain.Usuario;
import com.labdevweb.goeventapp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserSecurityService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> result = usuarioRepository.findByEmail(username);
        if(result.isPresent()) {
            return result.get();
        }
        throw new UsernameNotFoundException("Usuário não encontrado.");
    }
}
