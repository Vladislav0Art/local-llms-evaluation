package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetCodigoInterno_DadosValidos {

    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setCodigoInterno_DadosValidos() {
        objetoDeTeste.setCodigoInterno("12345");
        assertEquals("12345", objetoDeTeste.getCodigoInterno());
    }

}