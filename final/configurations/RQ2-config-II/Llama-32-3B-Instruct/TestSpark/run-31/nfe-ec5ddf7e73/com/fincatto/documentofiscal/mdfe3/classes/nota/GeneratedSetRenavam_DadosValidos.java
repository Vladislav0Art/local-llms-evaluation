package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedSetRenavam_DadosValidos {

    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setRenavam_DadosValidos() {
        objetoDeTeste.setRenavam("1234567890");
        assertEquals("1234567890", objetoDeTeste.getRenavam());
    }

}