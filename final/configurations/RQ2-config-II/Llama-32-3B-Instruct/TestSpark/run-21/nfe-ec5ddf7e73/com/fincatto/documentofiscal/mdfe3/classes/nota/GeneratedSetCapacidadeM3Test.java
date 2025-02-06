package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.UUID;

@RunWith(org.junit4.JUnit4ClassRunner.class)
public class GeneratedSetCapacidadeM3Test {

    @Mock
    private DFStringValidador stringValidador;

    public static final String CODIGO_INTERNO = UUID.randomUUID().toString();
    public static final String PLACA = UUID.randomUUID().toString();
    public static final String RENAVAM = UUID.randomUUID().toString();
    public static final String TARA = UUID.randomUUID().toString();

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCapacidadeM3Test() {
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("30m3");
        assertEquals("30m3", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}