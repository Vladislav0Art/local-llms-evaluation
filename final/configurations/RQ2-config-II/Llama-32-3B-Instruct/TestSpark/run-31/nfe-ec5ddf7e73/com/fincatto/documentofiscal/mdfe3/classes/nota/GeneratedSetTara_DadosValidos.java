package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetTara_DadosValidos {

    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setTara_DadosValidos() {
        objetoDeTeste.setTara("100kg");
        assertEquals("100kg", objetoDeTeste.getTara());
    }

}