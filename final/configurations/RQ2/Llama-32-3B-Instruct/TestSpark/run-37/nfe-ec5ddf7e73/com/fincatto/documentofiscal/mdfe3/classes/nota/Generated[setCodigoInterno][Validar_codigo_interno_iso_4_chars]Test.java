package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.simpleframework.xml.Element;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Generated[setCodigoInterno][Validar_codigo_interno_iso_4_chars]

Test {

    @Mock
    private DFStringValidador validador;

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void [setCodigoInterno][Validar_codigo_interno_iso_4_chars]Test() {
        when(validador.validar("1234567")).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("1234567");
        assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}