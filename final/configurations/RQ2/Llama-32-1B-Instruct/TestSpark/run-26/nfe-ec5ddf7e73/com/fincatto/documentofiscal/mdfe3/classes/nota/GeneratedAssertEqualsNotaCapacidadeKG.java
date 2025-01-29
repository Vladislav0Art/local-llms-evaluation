package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

public class GeneratedAssertEqualsNotaCapacidadeKG {

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
    public void assertEqualsNotaCapacidadeKG() {
        Nota nota = new Nota();
        assertEquals(5, nota.getCapacidadeKG());
    }

}