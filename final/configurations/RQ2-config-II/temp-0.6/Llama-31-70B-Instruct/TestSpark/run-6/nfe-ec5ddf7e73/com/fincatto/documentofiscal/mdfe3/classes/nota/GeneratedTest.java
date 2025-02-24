package com.fincatto.documentofiscal.mdfe3.classes.nota;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque testClass;

    @Before
    public void setUp() throws Exception {
        testClass = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    // Tests for setCodigoInterno method

    @Test
    public void setCodigoInternoTest() {
        String codigoInterno = "CodigoInterno";
        testClass.setCodigoInterno(codigoInterno);
        Assert.assertEquals(codigoInterno, testClass.getCodigoInterno());
    }

    @Test
    public void setCodigoInternoTestWithEmptyString() {
        testClass.setCodigoInterno("");
    }

    @Test
    public void setPlacaTest() {
        String placa = "Placa";
        testClass.setPlaca(placa);
        Assert.assertEquals(placa, testClass.getPlaca());
    }

    @Test
    public void setPlacaTestWithEmptyString() {
        testClass.setPlaca("");
    }

    @Test
    public void setRenavamTest() {
        String renavam = "Renavam";
        testClass.setRenavam(renavam);
        Assert.assertEquals(renavam, testClass.getRenavam());
    }

    @Test
    public void setRenavamTestWithEmptyString() {
        testClass.setRenavam("");
    }

}