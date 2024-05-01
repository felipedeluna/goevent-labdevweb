package com.labdevweb.goeventapp.event;

import com.labdevweb.goeventapp.domain.Usuario;
import com.labdevweb.goeventapp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessListener {

    @Autowired
    private UsuarioService usuarioService;

    @EventListener
    public void onAuthenticationSuccess(AuthenticationSuccessEvent event) {
        try {
            String email = event.getAuthentication().getName();
            Usuario usuario = usuarioService.findByEmail(email);
        } catch (AuthenticationException ex){
            ex.printStackTrace();
        }
    }

}
