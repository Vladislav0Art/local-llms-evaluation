package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "Test";
        testObject.setTara(tara);
        assertEquals(tara, testObject.getTara());
    }

}