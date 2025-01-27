package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetDADOSINICIAIS {

    @Mock
    private DFStringValidador validador;

    @Mock
    private Map<String, String> dados;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void testGetDADOSINICIAIS() {
        when(dados.keySet().iterator().next()).thenReturn("key");
        when(dados.values().iterator().next()).thenReturn("value");
        assertEquals(dados, objetoDeTeste.getDADOSINICIAIS());
    }
}

class MDFInfoModalRodoviarioVeiculoReboque {
    private DFStringValidador validador;

    public void setValidador(DFStringValidador validador) {
        this.validador = validador;
    }

    public String getCapacidadeKG() {
        return capacidadeKG;
    }

    public void setCapacidadeKG(String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    public void setCapacidadeM3(String capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }

    public Map<String, String> getDADOSINICIAIS() {
        return dados;
    }

    private String capacidadeKG;
    private String capacidadeM3;

    public MDFInfoModalRodoviarioVeiculoReboque() {
        this.validador = new DFStringValidador();
        this.capacidadeKG = "";
        this.capacidadeM3 = "";
        this.dados = new HashMap<>();
    }

    @Override
    public String toString() {
        return "MDFInfoModalRodoviarioVeiculoReboque{" +
                "capacidadeKG='" + capacidadeKG + '\'' +
                ", capacidadeM3='" + capacidadeM3 + '\'' +
                '}';
    }
}

class DFStringValidador {

    @Override
    public boolean validate(String s) {
        return true;
    }

    @Override
    public String toString() {
        return "DFStringValidador";
    }

}