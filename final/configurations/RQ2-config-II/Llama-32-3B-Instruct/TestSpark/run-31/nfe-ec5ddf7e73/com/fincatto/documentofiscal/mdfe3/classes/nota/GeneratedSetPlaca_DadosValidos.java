package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetPlaca_DadosValidos {

    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setPlaca_DadosValidos() {
        objetoDeTeste.setPlaca("1234567");
        assertEquals("1234567", objetoDeTeste.getPlaca());
    }

}