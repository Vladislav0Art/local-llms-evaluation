package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedTara_TaraTooLongTest {

    @Test
    public void tara_TaraTooLongTest() {
        final String tara = "12345678901234567890";
        assert false == DFStringValidador.capacidadeNDigitos(tara, "Tara em reboque", 5);
    }

}