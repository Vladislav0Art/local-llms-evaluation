package com.fincatto.documentofiscal.mdfe3.classes.nota;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCodigoInternoTest {

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

}