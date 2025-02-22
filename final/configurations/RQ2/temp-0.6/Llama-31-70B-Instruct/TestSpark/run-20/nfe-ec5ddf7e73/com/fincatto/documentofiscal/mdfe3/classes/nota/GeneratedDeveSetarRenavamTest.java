package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedDeveSetarRenavamTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void deveSetarRenavamTest() {
        reboque.setRenavam("12345678901");
        assertEquals("12345678901", reboque.getRenavam());
    }

}