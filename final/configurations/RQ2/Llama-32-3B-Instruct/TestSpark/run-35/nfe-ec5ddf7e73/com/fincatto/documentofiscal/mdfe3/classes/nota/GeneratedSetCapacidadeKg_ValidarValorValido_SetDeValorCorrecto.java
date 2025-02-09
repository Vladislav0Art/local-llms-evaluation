package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Random;

public class GeneratedSetCapacidadeKg_ValidarValorValido_SetDeValorCorrecto {

    @Mock
    private DFStringValidador validador;

    public static final String codigoInternoMock = "mock_codigo_interno";
    public static final String placaMock = "mock_placa";
    public static final String renavamMock = "mock_renavam";
    public static final String taraMock = "mock_tara";

    @Test
    public void setCapacidadeKg_ValidarValorValido_SetDeValorCorrecto() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKgMock = "mock_capacidadeKg";
        modal.setCapacidadeKg(capacidadeKgMock);
        assertEquals(capacidadeKgMock, modal.getCapacidadeKg());
    }

}