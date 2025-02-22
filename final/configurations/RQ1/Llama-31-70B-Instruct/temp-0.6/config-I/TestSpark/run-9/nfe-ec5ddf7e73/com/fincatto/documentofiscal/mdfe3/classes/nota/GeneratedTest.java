package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedCodigoInterno = "0123456789";
        mDFInfoModalRodoviarioVeiculoReboque.setCodigoInterno(expectedCodigoInterno);
        assertEquals(expectedCodigoInterno, mDFInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque mDFInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String expectedPlaca = "ABC1234";
        mDFInfoModalRodoviarioVeiculoReboque.setPlaca(expectedPlaca);
        assertEquals(expectedPlaca, mDFInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}