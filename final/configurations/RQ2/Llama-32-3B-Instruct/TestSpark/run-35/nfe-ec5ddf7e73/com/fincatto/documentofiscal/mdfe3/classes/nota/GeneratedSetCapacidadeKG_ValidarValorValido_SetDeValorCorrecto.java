package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeKG_ValidarValorValido_SetDeValorCorrecto {

    @Mock
    private DFStringValidador validador;

    public static final String codigoInternoMock = "mock_codigo_interno";
    public static final String placaMock = "mock_placa";
    public static final String renavamMock = "mock_renavam";
    public static final String taraMock = "mock_tara";

    @Test
    public void setCapacidadeKG_ValidarValorValido_SetDeValorCorrecto() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKgMock = "mock_capacidadeKg";
        final Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            if (random.nextBoolean()) {
                modal.setCapacidadeKG(capacidadeKgMock);
            }
            assertEquals(capacidadeKgMock, modal.getCapacidadeKG());
        }
    }

}