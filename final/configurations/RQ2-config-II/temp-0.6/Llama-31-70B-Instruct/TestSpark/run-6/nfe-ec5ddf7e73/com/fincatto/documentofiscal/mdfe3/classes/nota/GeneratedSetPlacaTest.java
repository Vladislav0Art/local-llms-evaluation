package com.fincatto.documentofiscal.mdfe3.classes.nota;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetPlacaTest {

    private MDFInfoModalRodoviarioVeiculoReboque testClass;

    @Before
    public void setUp() throws Exception {
        testClass = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    // Tests for setCodigoInterno method

    @Test
    public void setPlacaTest() {
        String placa = "Placa";
        testClass.setPlaca(placa);
        Assert.assertEquals(placa, testClass.getPlaca());
    }

}