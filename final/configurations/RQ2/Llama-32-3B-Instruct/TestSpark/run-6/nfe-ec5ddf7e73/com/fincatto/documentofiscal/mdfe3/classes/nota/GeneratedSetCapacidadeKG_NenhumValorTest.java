package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCapacidadeKG_NenhumValorTest {

    @Test
    public void setCapacidadeKG_NenhumValorTest() {
        String capacidadeKG = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals("0kg", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}