package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetTaraValidoTest {

    @Test
    public void setTaraValidoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraValida = "12345";
        obj.setTara(taraValida);
        assertEquals("Tara em reboque", obj.getTara());
    }

}