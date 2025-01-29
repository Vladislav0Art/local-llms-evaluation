package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetTara {

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