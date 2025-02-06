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
public class GeneratedTest {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    public class SetCodigoInternoTest {

        @Test
        public void givenCodigoInternoInvalido_ThenFalha() {
            assertFalse(mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("invalid"));
        }

        @Test
        public void givenCodigoInternoValido_ThenSucesso() {
            when(dfStringValidador.validar(anyString())).thenReturn(true);
            mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("valid");
            assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
        }
    }

    @Test
    public void givenPlacaInvalido_ThenFalha() {
        assertFalse(mdfInfoModalRodoviarioVeiculoReboque.setPlaca("invalid"));
    }

    @Test
    public void givenPlacaValida_ThenSucesso() {
        when(dfStringValidador.validar(anyString())).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca("valid");
        assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }
}

@Test
public void givenRenavamInvalido_ThenFalha() {
    assertFalse(mdfInfoModalRodoviarioVeiculoReboque.setRenavam("invalid"));
}

@Test
public void givenRenavamValida_ThenSucesso() {
    when(dfStringValidador.validar(anyString())).thenReturn(true);
    mdfInfoModalRodoviarioVeiculoReboque.setRenavam("valid");
    assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
}
	}

@Test
public void givenTaraInvalido_ThenFalha() {
    assertFalse(mdfInfoModalRodoviarioVeiculoReboque.setTara("invalid"));
}

@Test
public void givenTaraValida_ThenSucesso() {
    when(dfStringValidador.validar(anyString())).thenReturn(true);
    mdfInfoModalRodoviarioVeiculoReboque.setTara("valid");
    assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getTara());
}
	}

@Test
public void givenCapacidadeKgInvalida_ThenFalha() {
    assertFalse(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
}

@Test
public void givenCapacidadeKgValida_ThenSucesso() {
    mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("valid");
    assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
}
	}

@Test
public void givenCapacidadeM3Invalida_ThenFalha() {
    assertFalse(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
}

@Test
public void givenCapacidadeM3Valida_ThenSucesso() {
    mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("valid");
    assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
}
	}

            }