package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedSetTara_ValidadorSatisfechaTara_Ok {

    @Test
    public void setTara_ValidadorSatisfechaTara_Ok() {
        String tara = "100kg";
        List<String> validadores = new ArrayList<>();
        validadores.add(new DFStringValidador(tara));
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertTrue(obj.getTara());
    }

}