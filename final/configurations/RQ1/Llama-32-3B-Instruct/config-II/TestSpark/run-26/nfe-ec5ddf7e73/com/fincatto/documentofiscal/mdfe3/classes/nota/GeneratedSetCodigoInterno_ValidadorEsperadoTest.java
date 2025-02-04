package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCodigoInterno_ValidadorEsperadoTest {

    @Mock
    private DFStringValidador validador;

    @Test
    public void setCodigoInterno_ValidadorEsperadoTest() {
        when(validador.validar("1234567890", "Codigo interno Veiculo Reboque", 10, false, false)).thenReturn("1234567890");
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno("1234567890");
        assertTrue(obj.getCodigoInterno().equals("1234567890"));
    }

}