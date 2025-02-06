package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetPlaca_ValidadorDePlaca_RetornaFalse {

    @Test
    public void setPlaca_ValidadorDePlaca_RetornaFalse() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean retorno = obj.setPlaca("ABC123");
        assertFalse(retorno);
    }

}