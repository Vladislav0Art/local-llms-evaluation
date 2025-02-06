package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_DevemSerNulo() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertTrue(obj.getCodigoInterno() == null);
    }

    @Test
    public void setCodigoInterno_PreencheCampoDeJáExistente() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca("ABC123");
        obj.setCodigoInterno("DEF456");
        assertEquals("DEF456", obj.getCodigoInterno());
    }

    @Test
    public void setPlaca_CampoDePlacaNãoPreenchido() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaMocked = Mockito.mock(String.class);
        when(obj.setPlaca(placaMocked)).thenReturn(obj);
        assertEquals("ABC123", obj.getPlaca());
    }

    @Test
    public void setRenavam_DevemSerNulo() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertTrue(obj.getRenavam() == null);
    }

    @Test
    public void setTara_CampoDeTaraNãoPreenchido() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraMocked = Mockito.mock(String.class);
        when(obj.setTara(taraMocked)).thenReturn(obj);
        assertEquals("DEF456", obj.getRenavam());
    }

    @Test
    public void setCapacidadeKG_PreencheCampoDeCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        Random rand = new Random();
        String capacidadeKGMocked = String.valueOf(rand.nextInt(100));
        when(obj.setCapacidadeKG(capacidadeKGMocked)).thenReturn(obj);
        assertEquals("50", obj.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3_PreencheCampoDeCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        Random rand = new Random();
        String capacidadeM3Mocked = String.valueOf(rand.nextInt(100));
        when(obj.setCapacidadeM3(capacidadeM3Mocked)).thenReturn(obj);
        assertEquals("50", obj.getCapacidadeM3());
    }

}