package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetCode {

    @BeforeEach
    void setup() {
        mdf = new MDF();
    }

    @Test
    public void testGetCode() throws Exception {
        assertEquals("codigoInterno", mdf.getCode());
    }

}