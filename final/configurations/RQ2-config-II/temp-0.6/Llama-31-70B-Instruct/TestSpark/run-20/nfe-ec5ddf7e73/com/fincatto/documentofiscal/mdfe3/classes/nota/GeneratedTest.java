package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setCodigoInternoTest() {
        when(reboque.setCodigoInterno("codigoInterno")).thenCallRealMethod();
        reboque.setCodigoInterno("codigoInterno");
        assertEquals("codigoInterno", reboque.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        when(reboque.setPlaca("placa")).thenCallRealMethod();
        reboque.setPlaca("placa");
        assertEquals("placa", reboque.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        when(reboque.setRenavam("renavam")).thenCallRealMethod();
        reboque.setRenavam("renavam");
        assertEquals("renavam", reboque.getRenavam());
    }

}