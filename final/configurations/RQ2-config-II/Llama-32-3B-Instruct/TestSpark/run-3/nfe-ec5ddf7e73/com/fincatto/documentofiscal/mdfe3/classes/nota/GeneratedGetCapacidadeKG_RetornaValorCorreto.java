package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetCapacidadeKG_RetornaValorCorreto {

    @Test
    public void getCapacidadeKG_RetornaValorCorreto() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("100kg");
        assertEquals(100, Integer.parseInt(obj.getCapacidadeKG()));
    }

}