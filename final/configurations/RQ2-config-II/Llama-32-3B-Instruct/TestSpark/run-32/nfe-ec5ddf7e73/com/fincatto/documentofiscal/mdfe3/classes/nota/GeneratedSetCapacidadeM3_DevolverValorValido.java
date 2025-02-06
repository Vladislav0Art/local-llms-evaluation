package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeM3_DevolverValorValido {

    @Test
    public void setCapacidadeM3_DevolverValorValido() throws Exception {
        final String capacidadeM3 = "100m3";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("capacidadeM3");
        assertTrue(DFStringValidador.validar(field.get(obj).toString()));
    }

}