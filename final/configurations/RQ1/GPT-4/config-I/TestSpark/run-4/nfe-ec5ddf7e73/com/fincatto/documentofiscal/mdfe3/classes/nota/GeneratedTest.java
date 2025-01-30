package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest_ValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", reboque.getCodigoInterno());
    }

    @Test
    public void setCodigoInternoTest_InValidLength() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("12345678901");
    }

    @Test
    public void setPlacaTest_ValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("ABC1234");
        assertEquals("ABC1234", reboque.getPlaca());
    }

    @Test
    public void setPlacaTest_InValidFormat() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("1234ABC");
    }

    @Test
    public void setRenavamTest_ValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("123456789");
        assertEquals("123456789", reboque.getRenavam());
    }

    @Test
    public void setRenavamTest_InValidLength() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("123456789012");
    }

    @Test
    public void setTaraTest_ValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("12345");
        assertEquals("12345", reboque.getTara());
    }

    @Test
    public void setTaraTest_InValidLength() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("123456");
    }

    @Test
    public void setCapacidadeKGTest_ValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("50000");
        assertEquals("50000", reboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKGTest_InValidLength() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("500000");
    }

    @Test
    public void setCapacidadeM3Test_ValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("50");
        assertEquals("50", reboque.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3Test_InValidLength() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("500");
    }

}