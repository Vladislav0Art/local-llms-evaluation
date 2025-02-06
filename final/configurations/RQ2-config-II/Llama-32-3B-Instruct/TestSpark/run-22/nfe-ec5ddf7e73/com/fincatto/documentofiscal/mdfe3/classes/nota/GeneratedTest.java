package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInterno_ScenarioValidoTest() {
        when(validador.validar(anyString())).thenReturn(true);
        mfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("codigoInternodeTest");
        assertEquals("codigoInternodeTest", mfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setCodigoInterno_ScenarioInvalidoTest() {
        when(validador.validar(anyString())).thenReturn(false);
        mfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("codigoInternodeTest");
        assertNull(mfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void getPlaca_ScenarioValidoTest() {
        when(validador.validar(anyString())).thenReturn(true);
        mfInfoModalRodoviarioVeiculoReboque.setPlaca("placaDeTest");
        assertEquals("placaDeTest", mfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void getPlaca_ScenarioInvalidoTest() {
        when(validador.validar(anyString())).thenReturn(false);
        mfInfoModalRodoviarioVeiculoReboque.setPlaca("placaDeTest");
        assertNull(mfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void getRenavam_ScenarioValidoTest() {
        when(validador.validar(anyString())).thenReturn(true);
        mfInfoModalRodoviarioVeiculoReboque.setRenavam("renavamDeTest");
        assertEquals("renavamDeTest", mfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void getRenavam_ScenarioInvalidoTest() {
        when(validador.validar(anyString())).thenReturn(false);
        mfInfoModalRodoviarioVeiculoReboque.setRenavam("renavamDeTest");
        assertNull(mfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void getTara_ScenarioValidoTest() {
        when(validador.validar(anyString())).thenReturn(true);
        mfInfoModalRodoviarioVeiculoReboque.setTara("taraDeTest");
        assertEquals("taraDeTest", mfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void getTara_ScenarioInvalidoTest() {
        when(validador.validar(anyString())).thenReturn(false);
        mfInfoModalRodoviarioVeiculoReboque.setTara("taraDeTest");
        assertNull(mfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void getCapacidadeKG_ScenarioValidoTest() {
        when(validador.validar(anyString())).thenReturn(true);
        mfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("capacidadeKgDeTest");
        assertEquals("capacidadeKgDeTest", mfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeKG_ScenarioInvalidoTest() {
        when(validador.validar(anyString())).thenReturn(false);
        mfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("capacidadeKgDeTest");
        assertNull(mfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3_ScenarioValidoTest() {
        when(validador.validar(anyString())).thenReturn(true);
        mfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("capacidadeM3DeTest");
        assertEquals("capacidadeM3DeTest", mfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_ScenarioInvalidoTest() {
        when(validador.validar(anyString())).thenReturn(false);
        mfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("capacidadeM3DeTest");
        assertNull(mfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}