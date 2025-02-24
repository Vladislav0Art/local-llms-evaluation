package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetPlaca_InvalidPlaca_Exception {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setPlaca_InvalidPlaca_Exception() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalStateException.class, () -> {
            reboque.setPlaca("AAA12345");
        });
    }

}