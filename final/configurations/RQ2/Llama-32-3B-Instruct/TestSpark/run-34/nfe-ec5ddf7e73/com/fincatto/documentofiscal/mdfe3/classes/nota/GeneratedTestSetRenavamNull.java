package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestSetRenavamNull {

    @Element(name = "CodigoInterno")
    private String codigoInterno;

    @Element(name = "Placa")
    private String placa;

    @Element(name = "Renavam")
    private String renavam;

    @Element(name = "Tara")
    private String tara;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        this.codigoInterno = "12345";
        this.placa = "ABC123";
        this.renavam = "1234567890";
        this.tara = "100kg";
    }

    @Test
    public void testSetRenavamNull() {
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(null));
    }

}