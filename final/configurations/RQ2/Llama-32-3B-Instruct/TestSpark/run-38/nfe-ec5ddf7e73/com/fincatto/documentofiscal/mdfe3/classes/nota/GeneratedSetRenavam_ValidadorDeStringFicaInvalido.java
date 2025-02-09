package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.simpleframework.xml.Element;

public class GeneratedSetRenavam_ValidadorDeStringFicaInvalido {

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
    public void setRenavam_ValidadorDeStringFicaInvalido() {
        Mockito.when(validador.isValidar(Mockito.anyString())).thenReturn(false);
        modal.setRenavam("renavam");
        assertFalse(modal.getRenavam().equals("renavam"));
    }

}