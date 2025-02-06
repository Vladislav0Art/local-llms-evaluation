package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.simpleframework.xml.Element;

public class GeneratedSetCapacidadeKG_DevolverValorValido {

    @Test
    public void setCapacidadeKG_DevolverValorValido() throws Exception {
        final String capacidadeKG = "500kg";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("capacidadeKG");
        assertTrue(DFStringValidador.validar(field.get(obj).toString()));
    }

}