package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetTara_InvalidString_ReturnsNothing {

    @Test
    public void setTara_InvalidString_ReturnsNothing() {
        String tara = "abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertEquals("", obj.getTara());
    }

}