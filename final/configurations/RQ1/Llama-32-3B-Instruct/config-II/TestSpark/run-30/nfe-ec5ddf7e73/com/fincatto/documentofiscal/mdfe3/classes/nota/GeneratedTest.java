package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.simpleframework.xml.Element;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DFStringValidador validador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInterno_ValidarCodigo() {
        when(validador.validador(anyString(), "Codigo interno Veiculo Reboque", 10, false, false)).thenReturn("codigo");
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("codigo");
        assertNotNull(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlaca_PlaçaDeVeiculo() {
        when(validador.placaDeVeiculo(anyString(), "Placa do reboque")).thenReturn("placa");
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca("placa");
        assertEquals("placa", mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void setRenavam_ValidarIntervalo() {
        when(validador.validaIntervalo(anyString(), 9, 11, "Renavam do reboque")).thenReturn("renavam");
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam("renavam");
        assertEquals("renavam", mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void setTara_CapacidadeNDigitos() {
        when(validador.capacidadeNDigitos(anyString(), "Tara em reboque", 5)).thenReturn("tara");
        mdfInfoModalRodoviarioVeiculoReboque.setTara("tara");
        assertEquals("tara", mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void setCapacidadeKG_CapacidadeNDigitos() {
        when(validador.capacidadeNDigitos(anyString(), "Capacidade em KG reboque", 5)).thenReturn("capacidade");
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("capacidade");
        assertEquals("capacidade", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3_CapacidadeNDigitos() {
        when(validador.capacidadeNDigitos(anyString(), "Capacidade em M3 reboque", 2)).thenReturn("m3");
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("m3");
        assertEquals("m3", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}