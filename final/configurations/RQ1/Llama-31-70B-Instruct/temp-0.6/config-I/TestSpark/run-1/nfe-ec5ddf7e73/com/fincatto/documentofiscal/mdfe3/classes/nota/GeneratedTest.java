package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testSetCodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setCodigoInterno("ABCDEFGHIJ");
        assertEquals("ABCDEFGHIJ", veiculo.getCodigoInterno());
    }

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setPlaca("AAA1111");
        assertEquals("AAA1111", veiculo.getPlaca());
    }

    @Test
    public void testSetRenavam() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setRenavam("12345678901");
        assertEquals("12345678901", veiculo.getRenavam());
    }

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque veiculo = new MDFInfoModalRodoviarioVeiculoReboque();
        veiculo.setTara("12345");
        assertEquals("12345", veiculo.getTara());
    }

}