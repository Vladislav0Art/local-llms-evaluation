package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedGetCapacidadeM3_DadosValidos {

    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void getCapacidadeM3_DadosValidos() {
        objetoDeTeste.setCapacidadeM3("100m3");
        assertEquals("100m3", objetoDeTeste.getCapacidadeM3());
    }

}