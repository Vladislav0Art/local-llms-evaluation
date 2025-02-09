package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeKG_Nulo_FicaInvalida {

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
    public void setCapacidadeKG_Nulo_FicaInvalida() {
        assertNull("setCapacidadeKG null", modal.setCapacidadeKG(null));
    }
}

public class MDFInfoModalRodoviarioVeiculoReboque {
    private DFStringValidador validador;

    public void setValidador(DFStringValidador validador) {
        this.validador = validador;
    }

    public String getCodigoInterno() {
        return "teste";
    }

    public String getPlaca() {
        return "placa";
    }

    public String getRenavam() {
        return "renavam";
    }

    public String getTara() {
        return "tara";
    }

    public String getCapacidadeKG() {
        return null;
    }

    public String setCapacidadeKG(String capacidadekg) {
        if (capacidadekg == null || capacidadekg.isEmpty())
            return null;
        else
            return capacidadekg;
    }

}