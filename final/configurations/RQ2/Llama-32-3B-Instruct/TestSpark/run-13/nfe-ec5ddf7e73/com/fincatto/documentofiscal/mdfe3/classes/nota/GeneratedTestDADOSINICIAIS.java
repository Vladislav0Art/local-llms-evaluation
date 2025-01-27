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
public class GeneratedTestDADOSINICIAIS {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void testDADOSINICIAIS() {
        Map<String, String> dados = new HashMap<>();
        dados.put("codigoInterno", "123456");
        dados.put("placa", "ABC123");
        dados.put("renavam", "ABC123");
        dados.put("tara", "100kg");
        objetoDeTeste.setCapacidadeKG("100kg");
        objetoDeTeste.setCapacidadeM3("100m3");
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

    private String capacidadeKG;

    public MDFInfoModalRodoviarioVeiculoReboque() {
        this.validador = new DFStringValidador();
    }

    public String getValidador() {
        return validador.toString();
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