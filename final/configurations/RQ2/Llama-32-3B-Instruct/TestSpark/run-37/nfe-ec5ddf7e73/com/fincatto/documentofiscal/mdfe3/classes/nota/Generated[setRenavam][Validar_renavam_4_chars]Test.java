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
public class Generated[setRenavam][Validar_renavam_4_chars]

Test {

    @Mock
    private DFStringValidador validador;

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void [setRenavam][Validar_renavam_4_chars]Test() {
        when(validador.validar("1234")).thenReturn(true);
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam("1234");
        assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}