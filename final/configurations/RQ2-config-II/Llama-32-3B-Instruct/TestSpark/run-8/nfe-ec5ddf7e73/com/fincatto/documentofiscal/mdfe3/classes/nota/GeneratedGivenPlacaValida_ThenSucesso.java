package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.simpleframework.xml.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedGivenPlacaValida_ThenSucesso {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    public class SetCodigoInternoTest {

        @Test
        public void givenPlacaValida_ThenSucesso() {
            when(dfStringValidador.validar(anyString())).thenReturn(true);
            mdfInfoModalRodoviarioVeiculoReboque.setPlaca("valid");
            assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
        }
    }

}