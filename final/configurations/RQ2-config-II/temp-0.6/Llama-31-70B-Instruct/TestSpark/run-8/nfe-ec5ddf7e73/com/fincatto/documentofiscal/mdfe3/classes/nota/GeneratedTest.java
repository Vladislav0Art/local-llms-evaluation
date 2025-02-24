package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setCodigoInterno_ValidCodigoInterno_NoException() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("123456789ABC");
    }

    @Test
    public void setCodigoInterno_InvalidCodigoInterno_Exception() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalStateException.class, () -> {
            reboque.setCodigoInterno("123456789ABC123");
        });
    }

    @Test
    public void setPlaca_ValidPlaca_NoException() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1234");
    }

    @Test
    public void setPlaca_InvalidPlaca_Exception() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalStateException.class, () -> {
            reboque.setPlaca("AAA12345");
        });
    }

    @Test
    public void setRenavam_ValidRenavam_NoException() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("12345678901234");
    }

}