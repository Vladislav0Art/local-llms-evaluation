package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

public class GeneratedTestSetPlaca_withInvalidString {

    @Test
    public void testSetPlaca_withInvalidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.placaDeVeiculo("a", "Placa do reboque");
        obj.setPlaca("a");
        assertNull(obj.placa);
    }

}