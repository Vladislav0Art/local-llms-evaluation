package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedSetCapacidadeM3_PreencheCampoDeCapacidadeM3 {

    @Test
    public void setCapacidadeM3_PreencheCampoDeCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        Random rand = new Random();
        String capacidadeM3Mocked = String.valueOf(rand.nextInt(100));
        when(obj.setCapacidadeM3(capacidadeM3Mocked)).thenReturn(obj);
        assertEquals("50", obj.getCapacidadeM3());
    }

}