package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestGetCapacidadeKG {

    private MDF mdf;

    @BeforeEach
    void setup() {
        mdf = new MDF("codigoInterno", "placa", "renavam", "tara", "capacidadeKG");
    }

    @Test
    public void testGetCapacidadeKG() throws Exception {
        String expected = "capacidadeKG";
        String actual = mdf.getCapacidadeKG();
        assertEquals(expected, actual);
    }

}