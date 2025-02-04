package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetPlaca_MockValidador {

    @Mock
    private DFStringValidador validador;
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
        this.mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        this.validador = new DFStringValidador();
        when(validador.validador("codigoInterno", "Codigo interno Veiculo Reboque", 10, false, false)).thenReturn("codigoInterno");
        when(validador.placaDeVeiculo("placaDeVeiculo", "Placa do reboque")).thenReturn("placaDeVeiculo");
    }

    @Test
    public void setPlaca_MockValidador() {
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca("placaDeVeiculo");
        assertTrue(validador.placaDeVeiculo.contains("placaDeVeiculo"));
    }

}