package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Generated[setCapacidadeM3][NonEmptyValueTest]

Test {

    @Mock
    private MDFInfoModalRodoviarioVeiculo mdfInfoModalRodoviarioVeiculo;

    public void setCodigoInterno ( final String codigoInterno){
        // Mock implementation for setting codigoInterno
    }

    public void setPlaca ( final String placa){
        // Mock implementation for setting placa
    }

    public void setRenavam ( final String renavam){
        // Mock implementation for setting renavam
    }

    public void setTara ( final String tara){
        // Mock implementation for setting tara
    }

    public String getCapacidadeKG () {
        // Mock implementation for getting capacidadeKG
        return "";
    }

    public void setCapacidadeKG ( final String capacidadeKG){
        // Mock implementation for setting capacidadeKG
    }

    public String getCapacidadeM3 () {
        // Mock implementation for getting capacidadeM3
        return "";
    }

    public void setCapacidadeM3 ( final String capacidadeM3){
        // Mock implementation for setting capacidadeM3
    }

    @Test
    public void [setCapacidadeM3][NonEmptyValueTest]Test() {
        when(mdfInfoModalRodoviarioVeiculo.setCapacidadeM3("capacidade")).thenReturn(true);
        setCapacidadeM3("capacidade");
        assertEquals("capacidade", getCapacidadeM3());
        assertTrue(true);
    }

}