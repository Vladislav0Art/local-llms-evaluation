package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedSetCapacidadeKGTest {

    @Test
    public void setCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("12345");
        Assert.assertEquals("12345", reboque.getCapacidadeKG());
    }

}