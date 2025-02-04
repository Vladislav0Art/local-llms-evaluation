package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_CodigoInvalido_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setCodigoInterno("ABC"));
    }

    @Test
    public void setCodigoInterno_CodigoValido_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

    @Test
    public void setPlaca_PlacaInvalida_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setPlaca("ABC"));
    }

    @Test
    public void setPlaca_PlacaValida_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

    @Test
    public void setRenavam_RenavamInvalido_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setRenavam("ABC"));
    }

    @Test
    public void setRenavam_RenavamValido_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

    @Test
    public void setTara_TaraInvalida_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setTara("ABC"));
    }

    @Test
    public void setTara_TaraValida_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

    @Test
    public void setCapacidadeKG_CapacidadeInvalida_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setCapacidadeKG("ABC"));
    }

    @Test
    public void setCapacidadeKG_CapacidadeValida_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("1234567890");
        assertNotThrows(IllegalArgumentException.class);
    }

    @Test
    public void setCapacidadeM3_CapacidadeInvalida_TraeExcecao() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> obj.setCapacidadeM3("ABC"));
    }

    @Test
    public void setCapacidadeM3_CapacidadeValida_EstoEsSucesso() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3("12");
        assertNotThrows(IllegalArgumentException.class);
    }

}