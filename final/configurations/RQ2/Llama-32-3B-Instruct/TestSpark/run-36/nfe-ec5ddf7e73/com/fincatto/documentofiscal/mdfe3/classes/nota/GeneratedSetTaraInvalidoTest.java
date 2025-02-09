package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetTaraInvalidoTest {

    @Test
    public void setTaraInvalidoTest() {
        String tara = "abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertFalse(obj.getTara().contains("kg"));
    }

}