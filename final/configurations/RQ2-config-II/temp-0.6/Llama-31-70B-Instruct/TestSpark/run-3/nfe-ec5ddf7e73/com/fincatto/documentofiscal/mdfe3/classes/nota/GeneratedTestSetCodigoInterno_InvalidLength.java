package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTestSetCodigoInterno_InvalidLength {

    @Test
    public void testSetCodigoInterno_InvalidLength() {
        MDFInfoModalRodoviarioVeiculoReboque veiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculoReboque.setCodigoInterno("1234567890"); // invalid length
    }

}