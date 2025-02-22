package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedSetCapacidadeM3Test {

    @Test
    public void setCapacidadeM3Test() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("12");
        Assert.assertEquals("12", reboque.getCapacidadeM3());
    }

}