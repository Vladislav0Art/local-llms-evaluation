package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    @Test
    public void testSetCodigoInterno() {
        String codigoInterno = "001";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void testSetPlaca() {
        String placa = "ABC123";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void testSetRenavam() {
        String renavam = "DEF456";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void testSetTara() {
        String tara = "GHI789";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(tara, mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    public void testGetCapacidadeKG() {
        String capacidadeKG = "JKLM";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    public void testSetCapacidadeM3() {
        String capacidadeM3 = "JK";
        when(dfStringValidador.validate(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}