package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetGetCapacidadeM3Test {

    @Test
    public void setGetCapacidadeM3Test() {
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeM3("12");
        assertEquals("12", reboque.getCapacidadeM3());
    }

}