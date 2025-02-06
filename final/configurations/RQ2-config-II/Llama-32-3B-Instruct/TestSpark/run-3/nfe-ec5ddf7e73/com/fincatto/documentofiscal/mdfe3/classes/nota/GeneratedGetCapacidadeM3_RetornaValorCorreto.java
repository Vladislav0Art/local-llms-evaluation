package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetCapacidadeM3_RetornaValorCorreto {

    @Test
    public void getCapacidadeM3_RetornaValorCorreto() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3("100m3");
        assertEquals(100, Integer.parseInt(obj.getCapacidadeM3()));
    }

}