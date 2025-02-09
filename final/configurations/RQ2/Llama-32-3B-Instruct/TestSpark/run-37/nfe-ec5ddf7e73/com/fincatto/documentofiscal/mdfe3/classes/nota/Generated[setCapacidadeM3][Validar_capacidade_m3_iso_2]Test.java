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
public class Generated[setCapacidadeM3][Validar_capacidade_m3_iso_2]

Test {

    @Mock
    private DFStringValidador validador;

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void [setCapacidadeM3][Validar_capacidade_m3_iso_2]Test() {
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("10");
        assertEquals(10, (int) mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}