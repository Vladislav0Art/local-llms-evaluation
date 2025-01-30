package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetCapacidadeKGInvalidTest {

    @Test
    public void setCapacidadeKGInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String invalidCapacidade = "123456";
        reboque.setCapacidadeKG(invalidCapacidade);
    }

}