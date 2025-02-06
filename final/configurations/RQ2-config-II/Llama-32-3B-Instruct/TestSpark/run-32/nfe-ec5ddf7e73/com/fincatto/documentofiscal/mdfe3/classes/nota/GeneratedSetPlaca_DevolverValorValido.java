package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.simpleframework.xml.Element;

public class GeneratedSetPlaca_DevolverValorValido {

    @Test
    public void setPlaca_DevolverValorValido() throws Exception {
        final String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("placa");
        assertTrue(DFStringValidador.validar(field.get(obj).toString()));
    }

}