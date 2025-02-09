package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeM3ValidInputTest {

    @Test
    public void setCapacidadeM3ValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("12345");
        assertEquals("12345", reboque.getCapacidadeM3());
    }

}