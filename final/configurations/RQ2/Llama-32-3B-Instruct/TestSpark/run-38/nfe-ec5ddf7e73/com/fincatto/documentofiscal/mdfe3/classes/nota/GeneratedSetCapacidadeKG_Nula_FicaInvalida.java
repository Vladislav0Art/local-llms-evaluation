package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.simpleframework.xml.Element;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeKG_Nula_FicaInvalida {

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
    public void setCapacidadeKG_Nula_FicaInvalida() {
        assertNull(modal.setCapacidadeKG(null));
    }

}