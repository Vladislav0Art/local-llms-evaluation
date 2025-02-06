package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeM3_DadosInvalidos {

    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setCapacidadeM3_DadosInvalidos() {
        try {
            objetoDeTeste.setCapacidadeM3(null);
            fail("Expectado NullPointerException");
        } catch (NullPointerException e) {
            assertEquals(true, true);
        }
    }
}

}