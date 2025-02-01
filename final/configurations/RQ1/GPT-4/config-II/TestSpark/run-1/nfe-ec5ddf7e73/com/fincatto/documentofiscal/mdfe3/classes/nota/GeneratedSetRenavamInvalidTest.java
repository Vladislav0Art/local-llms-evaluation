package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetRenavamInvalidTest {

    @Test
    public void setRenavamInvalidTest() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setRenavam("12345678"); // less than 9 digits
    }

}