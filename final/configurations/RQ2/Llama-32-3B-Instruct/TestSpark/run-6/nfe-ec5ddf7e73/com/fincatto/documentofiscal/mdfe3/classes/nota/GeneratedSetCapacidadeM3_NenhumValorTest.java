package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeM3_NenhumValorTest {

    @Test
    public void setCapacidadeM3_NenhumValorTest() {
        String capacidadeM3 = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals("0m³", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}