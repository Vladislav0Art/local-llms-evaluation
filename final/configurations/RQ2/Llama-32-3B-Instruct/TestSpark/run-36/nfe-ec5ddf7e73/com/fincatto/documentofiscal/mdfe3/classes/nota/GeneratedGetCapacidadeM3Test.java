package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetCapacidadeM3Test {

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "100m3";
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, obj.getCapacidadeM3());
    }

}