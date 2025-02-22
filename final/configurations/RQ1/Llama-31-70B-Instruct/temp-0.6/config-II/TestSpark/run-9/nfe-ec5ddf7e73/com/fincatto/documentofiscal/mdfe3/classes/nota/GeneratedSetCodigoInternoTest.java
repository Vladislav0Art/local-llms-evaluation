package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedCodigoInterno = "1234567890";
        mDFInfoModalRodoviarioVeiculoReboque.setCodigoInterno(expectedCodigoInterno);
        assertEquals(expectedCodigoInterno, mDFInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}