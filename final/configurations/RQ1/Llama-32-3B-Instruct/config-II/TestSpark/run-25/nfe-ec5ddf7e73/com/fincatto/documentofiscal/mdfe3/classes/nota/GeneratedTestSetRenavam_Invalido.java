package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestSetRenavam_Invalido {

    @Test
    public void testSetRenavam_Invalido() {
        String renavam = "AB";
        assertNotEquals("AB", new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam));
    }

}