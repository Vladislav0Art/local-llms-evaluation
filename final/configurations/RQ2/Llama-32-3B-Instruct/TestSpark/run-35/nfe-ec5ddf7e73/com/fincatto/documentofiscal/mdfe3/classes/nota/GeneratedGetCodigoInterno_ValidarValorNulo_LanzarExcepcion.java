package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Random;

@RunWith(JUnit4ClassRunner.class)
public class GeneratedGetCodigoInterno_ValidarValorNulo_LanzarExcepcion {

    @Mock
    private DFStringValidador validador;

    public static final String codigoInternoMock = "mock_codigo_interno";
    public static final String placaMock = "mock_placa";
    public static final String renavamMock = "mock_renavam";
    public static final String taraMock = "mock_tara";

    @Test
    public void getCodigoInterno_ValidarValorNulo_LanzarExcepcion() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            assertEquals(null, modal.getCodigoInterno());
            fail("No se lanzó la excepción");
        } catch (NullPointerException e) {
            // Correct exception
        }
    }

}