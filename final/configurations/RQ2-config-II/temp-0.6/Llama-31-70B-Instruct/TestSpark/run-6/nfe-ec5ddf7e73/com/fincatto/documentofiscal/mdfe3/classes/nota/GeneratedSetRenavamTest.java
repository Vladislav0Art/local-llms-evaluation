package com.fincatto.documentofiscal.mdfe3.classes.nota;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetRenavamTest {

    private MDFInfoModalRodoviarioVeiculoReboque testClass;

    @Before
    public void setUp() throws Exception {
        testClass = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    // Tests for setCodigoInterno method

    @Test
    public void setRenavamTest() {
        String renavam = "Renavam";
        testClass.setRenavam(renavam);
        Assert.assertEquals(renavam, testClass.getRenavam());
    }

}