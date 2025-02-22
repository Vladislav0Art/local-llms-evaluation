package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String expected = "1234567890";
        reboque.setCodigoInterno("1234567890");
        String actual = reboque.getCodigoInterno();
        assertEquals(expected, actual);
    }

}