package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "12345";
        veiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(veiculoReboque.getCodigoInterno(), codigoInterno);
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "AAA1234";
        veiculoReboque.setPlaca(placa);
        assertEquals(veiculoReboque.getPlaca(), placa);
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        veiculoReboque.setRenavam(renavam);
        assertEquals(veiculoReboque.getRenavam(), renavam);
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "5000";
        veiculoReboque.setTara(tara);
        assertEquals(veiculoReboque.getTara(), tara);
    }

    @Test
    public void getCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "1000";
        veiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(veiculoReboque.getCapacidadeKG(), capacidadeKG);
    }

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "2000";
        veiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(veiculoReboque.getCapacidadeKG(), capacidadeKG);
    }

    @Test
    public void getCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "15";
        veiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(veiculoReboque.getCapacidadeM3(), capacidadeM3);
    }

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "20";
        veiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(veiculoReboque.getCapacidadeM3(), capacidadeM3);
    }

}