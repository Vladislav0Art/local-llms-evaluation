package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DFStringValidador validador;

    public void setCodigoInterno() {
        // Implementation of setCodigoInterno
    }

    public void setPlaca() {
        // Implementation of setPlaca
    }

    public void setRenavam() {
        // Implementation of setRenavam
    }

    public void setTara() {
        // Implementation of setTara
    }

    @Test
    public void testGetCapacidadeKG() {
        String capacidadeKG = "10kg";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdf.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeKG() {
        String capacidadeKG = "20kg";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertEquals("20kg", mdf.getCapacidadeKG());
    }

    @Test
    public void testGetCapacidadeM3() {
        String capacidadeM3 = "5m3";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdf.getCapacidadeM3());
    }

    @Test
    public void testSetCapacidadeM3() {
        String capacidadeM3 = "10m3";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertEquals("10m3", mdf.getCapacidadeM3());
    }

}