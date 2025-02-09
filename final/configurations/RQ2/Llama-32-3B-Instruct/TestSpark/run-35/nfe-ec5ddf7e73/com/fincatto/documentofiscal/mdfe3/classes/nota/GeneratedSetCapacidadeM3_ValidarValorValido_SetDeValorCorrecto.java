package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Random;

public class GeneratedSetCapacidadeM3_ValidarValorValido_SetDeValorCorrecto {

    @Mock
    private DFStringValidador validador;

    public static final String codigoInternoMock = "mock_codigo_interno";
    public static final String placaMock = "mock_placa";
    public static final String renavamMock = "mock_renavam";
    public static final String taraMock = "mock_tara";

    @Test
    public void setCapacidadeM3_ValidarValorValido_SetDeValorCorrecto() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3Mock = "mock_capacidadeM3";
        modal.setCapacidadeM3(capacidadeM3Mock);
        assertEquals(capacidadeM3Mock, modal.getCapacidadeM3());
    }

}

public class MDFInfoModalRodoviarioVeiculoReboque {

    private String codigoInterno;
    private String placa;
    private String renavam;
    private String tara;
    private String capacidadeKg;
    private String capacidadeM3;

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setCapacidadeKg(String capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }

    public void setCapacidadeM3(String capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public String getCapacidadeKg() {
        return capacidadeKg;
    }

    public String getCapacidadeM3() {
        return capacidadeM3;
    }

}