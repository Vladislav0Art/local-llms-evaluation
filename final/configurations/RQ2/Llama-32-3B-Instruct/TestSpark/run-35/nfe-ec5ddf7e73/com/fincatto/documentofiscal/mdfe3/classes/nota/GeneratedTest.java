package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit4.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque testClass;

    public MDFInfoModalRodoviarioVeiculoReboqueTest(MDFInfoModalRodoviarioVeiculoReboque testClass) {
        this.getClass().getAnnotation(RunWith.class).value(0);
        this.testClass = testClass;
    }

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque modal;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void setCodigoInterno_ValidarDadoValido_SetDeValorCorrecto() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCodigoInterno(codigoInternoMock);
        assertEquals(codigoInternoMock, modal.getCodigoInterno());
    }

}