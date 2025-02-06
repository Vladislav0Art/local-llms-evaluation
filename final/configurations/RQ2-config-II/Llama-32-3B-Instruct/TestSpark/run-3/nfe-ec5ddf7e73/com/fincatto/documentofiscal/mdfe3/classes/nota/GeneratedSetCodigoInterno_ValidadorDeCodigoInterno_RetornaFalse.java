package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCodigoInterno_ValidadorDeCodigoInterno_RetornaFalse {

    @Test
    public void setCodigoInterno_ValidadorDeCodigoInterno_RetornaFalse() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean retorno = obj.setCodigoInterno("123456");
        assertFalse(retorno);
    }

}