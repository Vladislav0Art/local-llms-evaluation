package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedTest {

    private final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInternoTest() {
        String codigoInterno = "1234567890";
        reboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, reboque.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        String placa = "AAA1234";
        reboque.setPlaca(placa);
        assertEquals(placa, reboque.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        String renavam = "12345678901234";
        reboque.setRenavam(renavam);
        assertEquals(renavam, reboque.getRenavam());
    }

    @Test
    public void setTaraTest() {
        String tara = "1234567890";
        reboque.setTara(tara);
        assertEquals(tara, reboque.getTara());
    }

    @Test
    public void getCapacidadeKGTest() {
        String capacidadeKG = "1234567890";
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, reboque.getCapacidadeKG());
    }

}