package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeKG_DadosInvalidos {

    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setCapacidadeKG_DadosInvalidos() {
        try {
            objetoDeTeste.setCapacidadeKG(null);
            fail("Expectado NullPointerException");
        } catch (NullPointerException e) {
            assertEquals(true, true);
        }
    }

}