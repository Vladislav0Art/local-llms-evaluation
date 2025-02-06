package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedGetCapacidadeKG_DadosValidos {

    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void getCapacidadeKG_DadosValidos() {
        objetoDeTeste.setCapacidadeKG("500kg");
        assertEquals("500kg", objetoDeTeste.getCapacidadeKG());
    }

}