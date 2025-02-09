package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCapacidadeM3InvalidoTest {

    @Test
    public void setCapacidadeM3InvalidoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "abc";
        obj.setCapacidadeM3(capacidadeM3);
        assertFalse(obj.getCapacidadeM3().contains("m3"));
    }

}