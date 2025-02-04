package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestCapacidadeKGSet {

    @Test
    public void testCapacidadeKGSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "20000";
        object.setCapacidadeKG(capacidadeKG);
        assertEquals("20000", object.getCapacidadeKG());
    }

}