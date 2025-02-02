package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestTaraValidada {

    @Test
    public void testTaraValidada() {
        String tara = "100";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertTrue(obj.getTara().length() == 5 && !obj.getTara().isEmpty());
    }

}