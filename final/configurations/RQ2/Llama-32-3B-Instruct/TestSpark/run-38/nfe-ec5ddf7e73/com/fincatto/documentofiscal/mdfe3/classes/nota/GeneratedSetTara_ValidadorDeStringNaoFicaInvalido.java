package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.simpleframework.xml.Element;

public class GeneratedSetTara_ValidadorDeStringNaoFicaInvalido {

    @Mock
    private DFStringValidador validador;
    private MDFInfoModalRodoviarioVeiculoReboque modal;

    public void setup() {
        modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCodigoInterno("teste");
        modal.setPlaca("placa");
        modal.setRenavam("renavam");
        modal.setTara("tara");
    }

    @Test
    public void setTara_ValidadorDeStringNaoFicaInvalido() {
        Mockito.when(validador.isValidar(Mockito.anyString())).thenReturn(true);
        modal.setTara("tara");
        assertTrue(modal.getTara().equals("tara"));
    }

}