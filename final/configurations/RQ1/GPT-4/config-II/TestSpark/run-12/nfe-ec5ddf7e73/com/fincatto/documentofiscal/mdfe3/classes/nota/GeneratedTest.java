package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", reboque.getCodigoInterno());
    }

    @Test
    public void setCodigoInternoMaxLengthTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("12345678901");
    }

    @Test
    public void setPlacaTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("ABC1234");
        assertEquals("ABC1234", reboque.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("123456789");
        assertEquals("123456789", reboque.getRenavam());
    }

    @Test
    public void setRenavamInvalidLengthTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("12345678");
    }

    @Test
    public void setTaraTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("12345");
        assertEquals("12345", reboque.getTara());
    }

    @Test
    public void setTaraInvalidLengthTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("123456");
    }

    @Test
    public void setGetCapacidadeKGTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("12345");
        assertEquals("12345", reboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKGInvalidLengthTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("123456");
    }

    @Test
    public void setGetCapacidadeM3Test() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("12");
        assertEquals("12", reboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3InvalidLengthTest() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("123");
    }

}