package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedDeveSetarTaraTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void deveSetarTaraTest() {
        reboque.setTara("12345");
        assertEquals("12345", reboque.getTara());
    }

}