package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestTaraSet {

    @Test
    public void testTaraSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "10000";
        object.setTara(tara);
        assertEquals("10000", object.getTara());
    }

}