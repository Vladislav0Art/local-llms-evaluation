package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCodigoInterno_InvalidCodigoInterno_Exception {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setCodigoInterno_InvalidCodigoInterno_Exception() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalStateException.class, () -> {
            reboque.setCodigoInterno("123456789ABC123");
        });
    }

}