package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedSetCodigoInterno_InvalidValue_Tests {

    @Test
    public void setCodigoInterno_InvalidValue_Tests() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String invalidCodigo = "abcdefg";
        mdf.setCodigoInterno(invalidCodigo);
        assertNull(mdf.getCodigoInterno());
    }

}