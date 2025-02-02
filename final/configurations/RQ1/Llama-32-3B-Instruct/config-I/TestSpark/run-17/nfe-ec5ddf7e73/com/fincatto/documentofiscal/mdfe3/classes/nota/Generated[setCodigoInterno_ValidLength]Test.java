package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setCodigoInterno_ValidLength]

Test {

    @Test
    public void [setCodigoInterno_ValidLength]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String codigoInterno = "12345678901";
        reboque.setCodigoInterno(codigoInterno);
        assertEquals("12345678901", reboque super codigoInterno);
    }

}