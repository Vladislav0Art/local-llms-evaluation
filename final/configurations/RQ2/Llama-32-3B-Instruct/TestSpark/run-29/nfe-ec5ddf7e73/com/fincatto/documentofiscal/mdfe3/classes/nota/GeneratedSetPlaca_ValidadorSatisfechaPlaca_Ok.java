package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedSetPlaca_ValidadorSatisfechaPlaca_Ok {

    @Test
    public void setPlaca_ValidadorSatisfechaPlaca_Ok() {
        String placa = "ABC123";
        List<String> validadores = new ArrayList<>();
        validadores.add(new DFStringValidador(placa));
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertTrue(obj.getPlaca());
    }

}