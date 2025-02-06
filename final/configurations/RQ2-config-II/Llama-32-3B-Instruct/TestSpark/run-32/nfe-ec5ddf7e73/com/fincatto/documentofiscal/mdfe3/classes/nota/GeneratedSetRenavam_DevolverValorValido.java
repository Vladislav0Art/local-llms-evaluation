package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.simpleframework.xml.Element;

public class GeneratedSetRenavam_DevolverValorValido {

    @Test
    public void setRenavam_DevolverValorValido() throws Exception {
        final String renavam = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("renavam");
        assertTrue(DFStringValidador.validar(field.get(obj).toString()));
    }

}