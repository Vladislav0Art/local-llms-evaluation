package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestSetTara_CapacidadeNDigitos {

    @Test
    public void testSetTara_CapacidadeNDigitos() {
        String tara = "12345";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("12345", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

}