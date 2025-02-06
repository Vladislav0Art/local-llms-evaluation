package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCapacidadeM3_ValidadorDeCapacidadeM3_RetornaFalse {

    @Test
    public void setCapacidadeM3_ValidadorDeCapacidadeM3_RetornaFalse() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean retorno = obj.setCapacidadeM3("ABC123");
        assertFalse(retorno);
    }

}