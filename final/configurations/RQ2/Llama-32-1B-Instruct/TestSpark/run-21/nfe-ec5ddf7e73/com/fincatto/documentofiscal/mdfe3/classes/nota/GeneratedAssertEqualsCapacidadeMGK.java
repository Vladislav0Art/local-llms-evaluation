package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class GeneratedAssertEqualsCapacidadeMGK {

    public String getCapacidadeM3() {
        return "5";
    }

    public int getCapacidadeKG() {
        return 1000;
    }
}

public class TestModel {

    @Test
    public void assertEqualsCapacidadeMGK() {
        Model model = new Model();
        assertNotEquals("getCapacidadeM3", String.valueOf(model.getCapacidadeKG()));
        assertEquals("5", String.valueOf(model.getCapacidadeKG()));
    }

}