package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetRenavam_Invalido_Test {

    @Test
    public void setRenavam_Invalido_Test() {
        String renavam = "RENAVAM_INVALIDO";
        MDFStringValidador dfStringValidador = new MDFStringValidador();
        assertFalse(dfStringValidador.validar(renavam));
    }

}