package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCodigoInternoValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("1234");
        assertEquals("1234", reboque.getCodigoInterno());
    }

    @Test
    public void setCodigoInternoInvalidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("123456789012345678901");
    }

    @Test
    public void setPlacaValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AB123CD");
        assertEquals("AB123CD", reboque.getPlaca());
    }

    @Test
    public void setPlacaInvalidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AB1234CD");
    }

    @Test
    public void setRenavamValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("12345678901");
        assertEquals("12345678901", reboque.getRenavam());
    }

    @Test
    public void setTaraValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("12345");
        assertEquals("12345", reboque.getTara());
    }

    @Test
    public void setCapacidadeKGValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("12345");
        assertEquals("12345", reboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3ValidInputTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("12345");
        assertEquals("12345", reboque.getCapacidadeM3());
    }

}