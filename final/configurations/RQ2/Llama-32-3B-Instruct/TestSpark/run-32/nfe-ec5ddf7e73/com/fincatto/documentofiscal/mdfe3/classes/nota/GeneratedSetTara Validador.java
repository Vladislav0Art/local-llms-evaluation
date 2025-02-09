package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedSetTara Validador {

    @Test
    public void setTara

    Validador() {
        String tara = "tara";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara(tara);
        assertTrue(DFStringValidador.isValidar(tara));
    }

}