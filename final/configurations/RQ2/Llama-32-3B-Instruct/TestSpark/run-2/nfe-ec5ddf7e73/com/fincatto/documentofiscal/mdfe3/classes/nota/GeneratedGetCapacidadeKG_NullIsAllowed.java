package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedGetCapacidadeKG_NullIsAllowed {

    @Test
    public void getCapacidadeKG_NullIsAllowed() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(null);
        assertNull(mdf.getCapacidadeKG());
    }

}