package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedSetRenavam_NullIsAllowed {

    @Test
    public void setRenavam_NullIsAllowed() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(null);
        assertNull(mdf.getRenavam());
    }

}