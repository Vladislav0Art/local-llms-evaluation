package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestGetCapacidadeM3 {

    private MDF mdf;

    @BeforeEach
    void setup() {
        mdf = new MDF("codigoInterno", "placa", "renavam", "tara", "capacidadeKG");
    }

    @Test
    public void testGetCapacidadeM3() throws Exception {
        String expected = "capacidadeM3";
        String actual = mdf.getCapacidadeM3();
        assertEquals(expected, actual);
    }

}