package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

public class GeneratedTestSetPlaca_withValidString {

    @Test
    public void testSetPlaca_withValidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.placaDeVeiculo("1234", "Placa do reboque");
        obj.setPlaca("1234");
        assertEquals("1234", obj.placa);
    }

}