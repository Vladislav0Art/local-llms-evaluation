package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeKG_SetaValorDeCapacidadeKG {

    @Element(name = "codigoInterno")
    public String codigoInterno;

    @Element(name = "placa")
    public String placa;

    @Element(name = "renavam")
    public String renavam;

    @Element(name = "tara")
    public String tara;

    @Element(name = "capacidadeKG")
    public String capacidadeKG;

    @Element(name = "capacidadeM3")
    public String capacidadeM3;

    @Test
    public void setCapacidadeKG_SetaValorDeCapacidadeKG() {
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG("outro valor");
        assertEquals("outro valor", capacidadeKG);
    }

}