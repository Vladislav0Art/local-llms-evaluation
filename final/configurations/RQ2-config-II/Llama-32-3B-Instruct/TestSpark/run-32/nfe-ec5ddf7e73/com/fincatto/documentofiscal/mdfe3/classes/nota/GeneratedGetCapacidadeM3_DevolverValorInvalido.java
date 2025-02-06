package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.simpleframework.xml.Element;

public class GeneratedGetCapacidadeM3_DevolverValorInvalido {

    @Test
    public void getCapacidadeM3_DevolverValorInvalido() throws Exception {
        final String capacidadeM3 = "abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("capacidadeM3");
        assertFalse(DFStringValidador.validar(field.get(obj).toString()));
    }

}