package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class GeneratedSetCapacidadeM3 CapacidadeNDigitos {

    @Test
    public void setCapacidadeM3

    CapacidadeNDigitos() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String capacidadeM3 = "12";
        modalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(2, capacidadeM3.length());
    }
}

}