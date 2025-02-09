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
public class GeneratedSetPlaca_ValidarDadoInvalido_ThrowException {

    @Mock
    private DFStringValidador validador;

    public static final String codigoInternoMock = "mock_codigo_interno";
    public static final String placaMock = "mock_placa";
    public static final String renavamMock = "mock_renavam";
    public static final String taraMock = "mock_tara";

    @Test
    public void setPlaca_ValidarDadoInvalido_ThrowException() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            modal.setPlaca("invalida");
            fail("Exceptio no lanzado.");
        } catch (Exception e) {
            assertEquals(validador, e.getCause());
        }
    }

}