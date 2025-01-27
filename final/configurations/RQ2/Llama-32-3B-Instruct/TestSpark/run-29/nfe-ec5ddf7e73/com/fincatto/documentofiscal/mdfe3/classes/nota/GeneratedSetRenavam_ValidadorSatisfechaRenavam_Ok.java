package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedSetRenavam_ValidadorSatisfechaRenavam_Ok {

    @Test
    public void setRenavam_ValidadorSatisfechaRenavam_Ok() {
        String renavam = "1234567890";
        List<String> validadores = new ArrayList<>();
        validadores.add(new DFStringValidador(renavam));
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertTrue(obj.getRenavam());
    }

}