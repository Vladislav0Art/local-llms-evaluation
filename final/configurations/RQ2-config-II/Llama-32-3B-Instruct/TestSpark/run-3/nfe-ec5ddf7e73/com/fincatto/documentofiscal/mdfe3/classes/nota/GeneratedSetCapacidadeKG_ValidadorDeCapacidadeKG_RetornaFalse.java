package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCapacidadeKG_ValidadorDeCapacidadeKG_RetornaFalse {

    @Test
    public void setCapacidadeKG_ValidadorDeCapacidadeKG_RetornaFalse() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean retorno = obj.setCapacidadeKG("ABC123");
        assertFalse(retorno);
    }

}