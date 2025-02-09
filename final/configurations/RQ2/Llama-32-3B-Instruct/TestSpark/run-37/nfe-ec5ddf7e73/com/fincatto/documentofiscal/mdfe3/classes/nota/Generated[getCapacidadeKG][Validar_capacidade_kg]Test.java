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
public class Generated[getCapacidadeKG][Validar_capacidade_kg]

Test {

    @Mock
    private DFStringValidador validador;

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void [getCapacidadeKG][Validar_capacidade_kg]Test() {
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG("10");
        assertEquals("10", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}