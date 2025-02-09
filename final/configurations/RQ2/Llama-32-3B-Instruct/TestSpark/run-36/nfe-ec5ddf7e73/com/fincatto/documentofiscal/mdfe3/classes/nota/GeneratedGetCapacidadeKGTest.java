package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetCapacidadeKGTest {

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "100kg";
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, obj.getCapacidadeKG());
    }

}