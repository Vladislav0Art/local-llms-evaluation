package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.simpleframework.xml.Element;

public class GeneratedSetCodigoInterno_DevolverValorValido {

    @Test
    public void setCodigoInterno_DevolverValorValido() throws Exception {
        final String codigoInterno = "123456";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("codigoInterno");
        assertTrue(DFStringValidador.validar(field.get(obj).toString()));
    }

}