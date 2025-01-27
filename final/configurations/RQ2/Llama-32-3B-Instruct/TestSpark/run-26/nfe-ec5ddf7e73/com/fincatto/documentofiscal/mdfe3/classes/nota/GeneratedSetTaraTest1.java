package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetTaraTest1 {

    @Test
    public void setTaraTest1() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraExpected = "100kg";
        obj.setTara(taraExpected);
        assertEquals(taraExpected, obj.getTara());
    }

}