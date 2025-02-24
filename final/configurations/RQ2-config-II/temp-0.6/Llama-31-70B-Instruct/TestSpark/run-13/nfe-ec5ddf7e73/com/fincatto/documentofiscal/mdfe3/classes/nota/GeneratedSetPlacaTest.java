package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "Test";
        testObject.setPlaca(placa);
        assertEquals(placa, testObject.getPlaca());
    }

}