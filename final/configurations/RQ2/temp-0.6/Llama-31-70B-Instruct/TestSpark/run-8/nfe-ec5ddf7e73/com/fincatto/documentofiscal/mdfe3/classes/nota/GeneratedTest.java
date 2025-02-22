package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("AB12345678");
        Assert.assertEquals("AB12345678", reboque.getCodigoInterno());
    }

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("12345");
        Assert.assertEquals("12345", reboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("12");
        Assert.assertEquals("12", reboque.getCapacidadeM3());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1234");
        Assert.assertEquals("AAA1234", reboque.getPlaca());
    }

}