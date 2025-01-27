package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedSetPlaca_NullIsAllowed {

    @Test
    public void setPlaca_NullIsAllowed() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(null);
        assertNull(mdf.getPlaca());
    }

}