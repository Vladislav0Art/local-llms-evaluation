package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCapacidadeKGValidoTest {

    @Test
    public void setCapacidadeKGValidoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "100kg";
        obj.setCapacidadeKG(capacidadeKG);
        assertTrue(obj.getCapacidadeKG().contains("kg"));
    }

}