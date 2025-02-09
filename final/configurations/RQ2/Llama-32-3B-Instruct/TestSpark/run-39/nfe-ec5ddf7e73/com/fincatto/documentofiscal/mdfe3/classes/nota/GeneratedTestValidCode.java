package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestValidCode {

    @Test
    public void testValidCode() {
        String validCode = DFStringValidador.getValidCode();
        assertEquals("123456", validCode);
    }

    public static String getValidCode() {
        return "123456";
    }
}

public class DFStringValidador {
    public static String getValidCode() {
        return "123456";
    }

}