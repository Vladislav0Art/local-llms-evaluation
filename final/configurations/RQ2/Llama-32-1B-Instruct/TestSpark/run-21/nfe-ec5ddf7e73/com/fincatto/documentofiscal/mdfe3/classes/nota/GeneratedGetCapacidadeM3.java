package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class GeneratedGetCapacidadeM3 {

    public String getCapacidadeM3() {
        return "5";
    }

    public int getCapacidadeKG() {
        return 1000;
    }
}

public class TestModel {

    @Test
    public void getCapacidadeM3() {
        Model model = new Model();
        assertCapacidadeKG(model, "getCapacidadeM3");
    }

    private Object getConstructor(String name) throws Exception {
        Class<?> clazz = Class.forName(name);
        Constructor<?> constructor = clazz.getConstructor();
        return constructor.newInstance();
    }

}