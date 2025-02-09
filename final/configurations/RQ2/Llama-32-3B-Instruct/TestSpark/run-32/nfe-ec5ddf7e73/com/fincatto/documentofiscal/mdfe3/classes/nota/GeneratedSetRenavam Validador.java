package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedSetRenavam Validador {

    @Test
    public void setRenavam

    Validador() {
        String renavam = "renavam";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(renavam);
        assertTrue(DFStringValidador.isValidar(renavam));
    }

}