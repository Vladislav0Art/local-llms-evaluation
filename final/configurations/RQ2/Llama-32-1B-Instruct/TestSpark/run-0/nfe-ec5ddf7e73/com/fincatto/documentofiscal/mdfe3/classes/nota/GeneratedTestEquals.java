package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestEquals {

    @BeforeEach
    void setup() {
        mdf = new MDF();
    }

    @Test
    public void testEquals() throws Exception {
        assertEquals("codigoInterno", mdf.getCodigoInterno());
        assertEquals("placa", mdf.getPlaca());
        assertEquals("renavam", mdf.getRenavam());
        assertEquals("tara", mdf.getTara());
        assertEquals("capacidadeKG", mdf.getCapacidadKG());
    }

}