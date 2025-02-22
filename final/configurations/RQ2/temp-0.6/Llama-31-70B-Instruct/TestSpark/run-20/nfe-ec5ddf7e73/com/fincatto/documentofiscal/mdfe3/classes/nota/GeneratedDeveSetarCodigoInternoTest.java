package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedDeveSetarCodigoInternoTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void deveSetarCodigoInternoTest() {
        reboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", reboque.getCodigoInterno());
    }

}