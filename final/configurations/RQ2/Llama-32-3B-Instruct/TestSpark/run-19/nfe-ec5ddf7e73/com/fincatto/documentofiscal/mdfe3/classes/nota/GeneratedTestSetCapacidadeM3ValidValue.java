package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCapacidadeM3ValidValue {

    @Mock
    private DFStringValidador validador;
    private MDFInfoModalRodoviarioVeiculoReboque informacoesModal;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
        informacoesModal = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void testSetCapacidadeM3ValidValue() {
        informacoesModal.setCapacidadeM3("10m3");
        assertEquals("10m3", informacoesModal.getCapacidadeM3().get());
    }

}