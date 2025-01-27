package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetTaraTest2 {

    @Test
    public void setTaraTest2() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraExpected = "150kg";
        obj.setTara(taraExpected);
        assertEquals(taraExpected, obj.getTara());
    }

}