package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetTara_ValidadorDeTara_RetornaFalse {

    @Test
    public void setTara_ValidadorDeTara_RetornaFalse() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean retorno = obj.setTara("ABC123");
        assertFalse(retorno);
    }

}