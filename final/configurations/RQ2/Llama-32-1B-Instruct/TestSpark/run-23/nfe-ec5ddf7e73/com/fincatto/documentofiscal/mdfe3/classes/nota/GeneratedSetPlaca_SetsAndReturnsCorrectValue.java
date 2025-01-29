package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetPlaca_SetsAndReturnsCorrectValue {

    @Test
    public void setPlaca_SetsAndReturnsCorrectValue() {
        String expected = "123";
        String actual = MDFInfoModalRodoviarioVeiculoReboque.setPlaca(expected);
        assertEquals(expected, actual);
    }

}