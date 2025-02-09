package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCapacidadeKGInvalidoTest {

    @Test
    public void setCapacidadeKGInvalidoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "abc";
        obj.setCapacidadeKG(capacidadeKG);
        assertFalse(obj.getCapacidadeKG().contains("kg"));
    }

}