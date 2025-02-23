package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetCodigoInterno() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", reboque.getCodigoInterno());
    }

    @Test
    public void testSetPlaca() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AB12CD34");
        assertEquals("AB12CD34", reboque.getPlaca());
    }

    @Test
    public void testSetRenavam() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("12345678901");
        assertEquals("12345678901", reboque.getRenavam());
    }

    @Test
    public void testSetTara() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("12345");
        assertEquals("12345", reboque.getTara());
    }

}