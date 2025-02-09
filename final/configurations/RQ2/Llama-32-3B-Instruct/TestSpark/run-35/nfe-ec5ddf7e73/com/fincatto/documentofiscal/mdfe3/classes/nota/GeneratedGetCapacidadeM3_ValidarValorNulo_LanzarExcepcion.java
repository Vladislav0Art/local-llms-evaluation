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
public class GeneratedGetCapacidadeM3_ValidarValorNulo_LanzarExcepcion {

    @Mock
    private DFStringValidador validador;

    public static final String codigoInternoMock = "mock_codigo_interno";
    public static final String placaMock = "mock_placa";
    public static final String renavamMock = "mock_renavam";
    public static final String taraMock = "mock_tara";

    @Test
    public void getCapacidadeM3_ValidarValorNulo_LanzarExcepcion() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            assertEquals("0", modal.getCapacidadeM3());
            fail("Excepción no lanzada.");
        } catch (Exception e) {
            assertEquals(null, e);
        }
    }

}