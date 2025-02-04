package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class GeneratedSetTara CapacidadeNDigitos {

    @Test
    public void setTara

    CapacidadeNDigitos() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String tara = "123";
        modalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(1, modalRodoviarioVeiculoReboque.getTara().length());
    }

}