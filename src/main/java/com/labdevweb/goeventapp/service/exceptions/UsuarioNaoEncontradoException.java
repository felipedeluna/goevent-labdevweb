package com.labdevweb.goeventapp.service.exceptions;

public class UsuarioNaoEncontradoException extends RuntimeException{

    public UsuarioNaoEncontradoException() {
        super("Usuário não encontrado");
    }

    public UsuarioNaoEncontradoException(String message) {
        super(message);
    }
}
