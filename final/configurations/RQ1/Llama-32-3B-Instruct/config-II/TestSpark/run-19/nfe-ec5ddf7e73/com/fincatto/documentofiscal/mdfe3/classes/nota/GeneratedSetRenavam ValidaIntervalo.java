package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class GeneratedSetRenavam ValidaIntervalo {

    @Test
    public void setRenavam

    ValidaIntervalo() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String renavam = "123456789";
        modalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, modalRodoviarioVeiculoReboque.getRenavam());
    }

}