package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedSetTara_CampoDeTaraNãoPreenchido {

    @Test
    public void setTara_CampoDeTaraNãoPreenchido() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraMocked = Mockito.mock(String.class);
        when(obj.setTara(taraMocked)).thenReturn(obj);
        assertEquals("DEF456", obj.getRenavam());
    }

}