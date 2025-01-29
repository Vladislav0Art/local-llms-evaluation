package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetTara_SetsAndReturnsCorrectValue {

    @Test
    public void setTara_SetsAndReturnsCorrectValue() {
        String expected = "789";
        String actual = MDFInfoModalRodoviarioVeiculoReboque.setTara(expected);
        assertEquals(expected, actual);
    }

}