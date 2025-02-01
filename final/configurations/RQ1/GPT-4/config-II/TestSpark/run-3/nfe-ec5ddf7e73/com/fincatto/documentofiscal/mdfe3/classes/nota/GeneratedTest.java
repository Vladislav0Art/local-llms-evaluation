package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setCodigoInterno("123456");
        assertEquals("123456", modalRodoviarioReboque.getCodigoInterno());
    }

    @Test
    public void setCodigoInternoInvalidLengthTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setCodigoInterno("12345678910");
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setPlaca("ABC1234");
        assertEquals("ABC1234", modalRodoviarioReboque.getPlaca());
    }

    @Test
    public void setPlacaInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setPlaca("1111111");
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setRenavam("123456789");
        assertEquals("123456789", modalRodoviarioReboque.getRenavam());
    }

    @Test
    public void setRenavamInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setRenavam("1234567891234");
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setTara("4321");
        assertEquals("4321", modalRodoviarioReboque.getTara());
    }

    @Test
    public void setTaraInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setTara("123456");
    }

    @Test
    public void getSetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setCapacidadeKG("12345");
        assertEquals("12345", modalRodoviarioReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKGInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setCapacidadeKG("123456");
    }

    @Test
    public void getSetCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setCapacidadeM3("12");
        assertEquals("12", modalRodoviarioReboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3InvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setCapacidadeM3("123");
    }

}