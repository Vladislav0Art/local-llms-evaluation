package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedSetPlaca Validador {

    @Test
    public void setPlaca

    Validador() {
        String placa = "placa";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(placa);
        assertTrue(DFStringValidador.isValidar(placa));
    }

}