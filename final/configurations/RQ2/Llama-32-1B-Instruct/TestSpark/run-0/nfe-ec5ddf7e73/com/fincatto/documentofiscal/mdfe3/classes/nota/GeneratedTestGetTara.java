package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetTara {

    @BeforeEach
    void setup() {
        mdf = new MDF();
    }

    @Test
    public void testGetTara() throws Exception {
        assertEquals("tara", mdf.getTara());
    }

}