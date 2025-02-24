package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInternoWithValidCodeTest {

    private static final String VALID_CODE = "12345678901234";
    private static final String VALID_CAPACITY_KG = "123456";

    @Test
    public void setCodigoInternoWithValidCodeTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCodigoInterno(VALID_CODE);
        assertEquals(VALID_CODE, veiculoReboque.getCodigoInterno());
    }

}