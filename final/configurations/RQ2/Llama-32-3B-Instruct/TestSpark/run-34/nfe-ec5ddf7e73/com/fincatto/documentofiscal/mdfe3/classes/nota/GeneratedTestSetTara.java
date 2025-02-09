package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestSetTara {

    @Element(name = "CodigoInterno")
    private String codigoInterno;

    @Element(name = "Placa")
    private String placa;

    @Element(name = "Renavam")
    private String renavam;

    @Element(name = "Tara")
    private String tara;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        codigoInterno = "12345";
        placa = "ABC123";
        renavam = "1234567890";
        tara = "100kg";
    }

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraExpected = "100kg";
        assertEquals(taraExpected, mdfInfoModalRodoviarioVeiculoReboque.setTara("100kg"));
    }

}