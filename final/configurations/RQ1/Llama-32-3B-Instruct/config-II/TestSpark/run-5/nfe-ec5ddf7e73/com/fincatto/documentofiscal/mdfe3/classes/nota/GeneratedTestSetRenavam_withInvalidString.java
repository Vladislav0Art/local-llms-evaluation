package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

public class GeneratedTestSetRenavam_withInvalidString {

    @Test
    public void testSetRenavam_withInvalidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.renavamDeVeiculo("a", "Renavam do reboque");
        obj.setRenavam("a");
        assertNull(obj.renavam);
    }

}