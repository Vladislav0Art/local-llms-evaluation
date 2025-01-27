package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetDadosIniciais_RetornaMapaComDados {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void getDadosIniciais_RetornaMapaComDados() {
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