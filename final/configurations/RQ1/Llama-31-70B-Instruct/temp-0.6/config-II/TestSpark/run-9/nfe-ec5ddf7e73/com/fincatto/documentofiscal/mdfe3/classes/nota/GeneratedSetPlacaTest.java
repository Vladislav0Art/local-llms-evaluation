package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedPlaca = "abc1234";
        mDFInfoModalRodoviarioVeiculoReboque.setPlaca(expectedPlaca);
        assertEquals(expectedPlaca, mDFInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}