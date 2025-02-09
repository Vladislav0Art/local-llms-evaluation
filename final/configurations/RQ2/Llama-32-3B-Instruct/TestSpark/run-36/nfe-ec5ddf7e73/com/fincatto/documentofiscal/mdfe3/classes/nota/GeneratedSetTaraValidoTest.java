package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetTaraValidoTest {

    @Test
    public void setTaraValidoTest() {
        String tara = "100kg";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertTrue(obj.getTara().contains("kg"));
    }

}