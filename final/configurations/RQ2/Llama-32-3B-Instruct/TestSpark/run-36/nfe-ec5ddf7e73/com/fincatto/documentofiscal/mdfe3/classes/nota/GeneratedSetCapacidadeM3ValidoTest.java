package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCapacidadeM3ValidoTest {

    @Test
    public void setCapacidadeM3ValidoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "100m3";
        obj.setCapacidadeM3(capacidadeM3);
        assertTrue(obj.getCapacidadeM3().contains("m3"));
    }

}