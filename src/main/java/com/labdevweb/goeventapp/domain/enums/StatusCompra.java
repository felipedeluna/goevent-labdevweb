package com.labdevweb.goeventapp.domain.enums;

public enum StatusCompra {
    AGUARDANDO_PAGAMENTO("Aguardando Pagamento"),
    PAGO("Pago"),
    CANCELADO("Cancelado");

    private final String descricao;

    private StatusCompra(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
