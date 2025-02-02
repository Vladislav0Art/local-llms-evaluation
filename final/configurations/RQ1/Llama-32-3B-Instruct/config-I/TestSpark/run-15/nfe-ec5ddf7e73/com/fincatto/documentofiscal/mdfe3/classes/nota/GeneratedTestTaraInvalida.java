package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestTaraInvalida {

    @Test
    public void testTaraInvalida() {
        String tara = "100abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertFalse(obj.getTara().length() == 5 && !obj.getTara().isEmpty());
    }

}