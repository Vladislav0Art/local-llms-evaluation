package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

@RunWith(org.junit4.JUnit4ClassRunner.class)
public class GeneratedSetCodigoInternoValidadoTest {

    @Mock
    private DFStringValidador stringValidador;

    public static final String CODIGO_INTERNO = UUID.randomUUID().toString();
    public static final String PLACA = UUID.randomUUID().toString();
    public static final String RENAVAM = UUID.randomUUID().toString();
    public static final String TARA = UUID.randomUUID().toString();

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInternoValidadoTest() {
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(CODIGO_INTERNO);
        Mockito.verify(stringValidador).isValid(CODIGO_INTERNO);
    }

}