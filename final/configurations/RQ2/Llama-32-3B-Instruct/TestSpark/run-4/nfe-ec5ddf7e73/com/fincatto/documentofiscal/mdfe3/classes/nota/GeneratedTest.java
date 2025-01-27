package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_EmptyString_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(""));
    }

    @Test
    public void setCodigoInterno_NullValue_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(null));
    }

    @Test
    public void setPlaca_EmptyString_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(""));
    }

    @Test
    public void setRenavam_EmptyString_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(""));
    }

    @Test
    public void setTara_EmptyString_ThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setTara(""));
    }

    @Test
    public void getCapacidadeKG_RetornaValueNotNull() {
        String capacidadeKG = "10.0";
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, modal.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_NullValue_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(null));
    }

}