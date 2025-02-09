package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.simpleframework.xml.Element;

public class GeneratedGetCapacidadeKG_NaoNula {

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
    public void getCapacidadeKG_NaoNula() {
        modal.setCapacidadeKG("10kg");
        assertNotNull(modal.getCapacidadeKG());
    }

}