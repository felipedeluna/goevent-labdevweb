package com.labdevweb.goeventapp.service.exceptions;

public class UsuarioNaoAutenticadoException extends  RuntimeException{
    public UsuarioNaoAutenticadoException() {
        super("Usuário não está autenticado");
    }

    public UsuarioNaoAutenticadoException(String message) {
        super(message);
    }
}
