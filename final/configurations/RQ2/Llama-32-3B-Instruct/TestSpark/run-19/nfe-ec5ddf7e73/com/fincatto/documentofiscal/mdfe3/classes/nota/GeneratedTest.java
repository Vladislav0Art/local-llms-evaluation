package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DFStringValidador validador;
    private MDFInfoModalRodoviarioVeiculoReboque informacoesModal;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
        informacoesModal = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void testSetCodigoInternoFailure() {
        informacoesModal.setCodigoInterno("123");
        assertFalse(informacoesModal.getCodigoInterno().equals(123));
    }

    @Test
    public void testGetCapacidadeKGEmptyValue() {
        informacoesModal.setCapacidadeKG(Optional.empty());
        assertNull(informacoesModal.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeKGValidValue() {
        informacoesModal.setCapacidadeKG("100kg");
        assertEquals("100kg", informacoesModal.getCapacidadeKG().get());
    }

    @Test
    public void testGetCapacidadeM3EmptyValue() {
        informacoesModal.setCapacidadeM3(Optional.empty());
        assertNull(informacoesModal.getCapacidadeM3());
    }

    @Test
    public void testSetCapacidadeM3ValidValue() {
        informacoesModal.setCapacidadeM3("10m3");
        assertEquals("10m3", informacoesModal.getCapacidadeM3().get());
    }

}