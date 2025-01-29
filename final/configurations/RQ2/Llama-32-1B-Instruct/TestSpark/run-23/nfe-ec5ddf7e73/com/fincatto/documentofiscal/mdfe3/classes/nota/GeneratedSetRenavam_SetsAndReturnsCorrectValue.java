package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSetRenavam_SetsAndReturnsCorrectValue {

    @Test
    public void setRenavam_SetsAndReturnsCorrectValue() {
        String expected = "456";
        String actual = MDFInfoModalRodoviarioVeiculoReboque.setRenavam(expected);
        assertEquals(expected, actual);
    }

}