package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

public class GeneratedAssertEqualsNotaPlaca {

    public int getCodigoInterno() {
        return 123;
    }

    public String getPlaca() {
        return "ABC";
    }

    public String getRenavam() {
        return "DEF";
    }

    public double getTara() {
        return 1.2;
    }

    public int getCapacidadeKG() {
        return 5;
    }

    public int getCapacidadeM3() {
        return 10;
    }
}

public class GeneratedTest {

    @Test
    public void assertEqualsNotaPlaca() {
        Nota nota = new Nota();
        assertEquals("ABC", nota.getPlaca());
    }

}