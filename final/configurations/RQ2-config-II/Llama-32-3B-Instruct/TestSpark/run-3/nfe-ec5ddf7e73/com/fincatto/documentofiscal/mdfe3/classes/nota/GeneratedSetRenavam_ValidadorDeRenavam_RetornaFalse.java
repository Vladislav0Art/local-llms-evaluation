package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetRenavam_ValidadorDeRenavam_RetornaFalse {

    @Test
    public void setRenavam_ValidadorDeRenavam_RetornaFalse() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean retorno = obj.setRenavam("123456");
        assertFalse(retorno);
    }

}