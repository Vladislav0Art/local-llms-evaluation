package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedSetCapacidadeKG_PreencheCampoDeCapacidadeKG {

    @Test
    public void setCapacidadeKG_PreencheCampoDeCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        Random rand = new Random();
        String capacidadeKGMocked = String.valueOf(rand.nextInt(100));
        when(obj.setCapacidadeKG(capacidadeKGMocked)).thenReturn(obj);
        assertEquals("50", obj.getCapacidadeKG());
    }

}