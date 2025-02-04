package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_InvalidValue_ReturnsFalse() {
        String codigoInterno = "1234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setCodigoInterno(codigoInterno);
        assertTrue(!resultado);
    }

    @Test
    public void setPlaca_PlacaDeVeiculo_InvalidValue_ReturnsFalse() {
        String placa = "1234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setPlaca(placa);
        assertFalse(resultado);
    }

    @Test
    public void setRenavam_RenavamDoReboque_InvalidValue_ReturnsFalse() {
        String renavam = "12345678901234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setRenavam(renavam);
        assertFalse(resultado);
    }

    @Test
    public void setTara_TaraEmReboque_InvalidValue_ReturnsFalse() {
        String tara = "123456789";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setTara(tara);
        assertTrue(!resultado);
    }

    @Test
    public void getCapacidadeKG_ReturnsNull() {
        assertNotNull(new MDFInfoModalRodoviarioVeiculoRebole().getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_CapacidadeEmKGReboque_InvalidValue_ReturnsFalse() {
        String capacidadeKG = "1234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setCapacidadeKG(capacidadeKG);
        assertTrue(!resultado);
    }

    @Test
    public void setCapacidadeM3_CapacidadeEmM3Reboque_InvalidValue_ReturnsFalse() {
        String capacidadeM3 = "12345678901234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setCapacidadeM3(capacidadeM3);
        assertFalse(resultado);
    }

    @Test
    public void getCapacidadeM3_ReturnsNull() {
        assertNotNull(new MDFInfoModalRodoviarioVeiculoRebole().getCapacidadeM3());
    }

}