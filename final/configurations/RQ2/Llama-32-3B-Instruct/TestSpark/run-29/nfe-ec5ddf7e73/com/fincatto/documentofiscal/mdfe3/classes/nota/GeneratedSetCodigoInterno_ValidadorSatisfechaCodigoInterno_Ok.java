package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedSetCodigoInterno_ValidadorSatisfechaCodigoInterno_Ok {

    @Test
    public void setCodigoInterno_ValidadorSatisfechaCodigoInterno_Ok() {
        String codigoInterno = "123456";
        List<String> validadores = new ArrayList<>();
        validadores.add(new DFStringValidador(codigoInterno));
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertTrue(obj.getCodigoInterno());
    }

}