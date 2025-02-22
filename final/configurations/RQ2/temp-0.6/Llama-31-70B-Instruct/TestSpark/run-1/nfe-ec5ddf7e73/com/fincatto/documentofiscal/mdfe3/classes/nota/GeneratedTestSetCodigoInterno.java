package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCodigoInterno {

    @Mock
    DFStringValidador mockedStringValidador;

    @Test
    public void testSetCodigoInterno() {
        final MDFInfoModalRodoviarioVeiculoReboque tested = new MDFInfoModalRodoviarioVeiculoReboque();
        final String codigoInterno = "1234567890";
        when(mockedStringValidador.validador(codigoInterno, "Codigo interno Veiculo Reboque", 10, false, false)).thenReturn(codigoInterno);
        tested.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, tested.getCodigoInterno());
    }

}