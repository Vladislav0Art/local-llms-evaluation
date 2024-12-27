package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Optional;

import com.fincatto.documentofiscal.mdfe3.classes.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.mdfe3.classes.MDFInfoModalRodoviarioVeiculo;

public class GeneratedCapacidadeM3GetTest {

    @Test
    public void capacidadeM3GetTest() {
        String capacidadeM3 = "TEST";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, object.getCapacidadeM3());
    }

}