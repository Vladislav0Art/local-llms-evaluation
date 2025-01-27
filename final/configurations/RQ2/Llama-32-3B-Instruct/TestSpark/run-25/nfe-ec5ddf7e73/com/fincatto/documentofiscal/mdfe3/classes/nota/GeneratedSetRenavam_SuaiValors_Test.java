package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetRenavam_SuaiValors_Test {

    @Test
    public void setRenavam_SuaiValors_Test() {
        String renavam = "RENAVAM_VALIDO";
        MDFStringValidador dfStringValidador = new MDFStringValidador();
        assertTrue(dfStringValidador.validar(renavam));
    }

}