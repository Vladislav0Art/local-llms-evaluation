package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedSetCapacidadeKG_InvalidValue_ThrowsException {

    @Test
    public void setCapacidadeKG_InvalidValue_ThrowsException() {
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG("invalid"));
    }

}