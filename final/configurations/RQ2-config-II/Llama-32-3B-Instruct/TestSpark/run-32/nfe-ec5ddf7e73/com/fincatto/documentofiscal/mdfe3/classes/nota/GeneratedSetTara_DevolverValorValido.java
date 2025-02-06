package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.simpleframework.xml.Element;

public class GeneratedSetTara_DevolverValorValido {

    @Test
    public void setTara_DevolverValorValido() throws Exception {
        final String tara = "100kg";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("tara");
        assertTrue(DFStringValidador.validar(field.get(obj).toString()));
    }

}