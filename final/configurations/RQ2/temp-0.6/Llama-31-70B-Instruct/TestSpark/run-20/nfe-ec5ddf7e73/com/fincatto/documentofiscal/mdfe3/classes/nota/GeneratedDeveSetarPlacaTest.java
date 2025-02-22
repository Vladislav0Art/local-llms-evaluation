package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedDeveSetarPlacaTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void deveSetarPlacaTest() {
        reboque.setPlaca("ABC1234");
        assertEquals("ABC1234", reboque.getPlaca());
    }

}