package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInterno_DadoValorInvalido_LanzaExcepoDeValidacao {

    @Test
    public void setCodigoInterno_DadoValorInvalido_LanzaExcepoDeValidacao() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "ABC";
        try {
            modal.setCodigoInterno(codigoInterno);
            fail(" nao lancou excepo de validacao");
        } catch (Exception e) {
            // passa
        }
    }

}