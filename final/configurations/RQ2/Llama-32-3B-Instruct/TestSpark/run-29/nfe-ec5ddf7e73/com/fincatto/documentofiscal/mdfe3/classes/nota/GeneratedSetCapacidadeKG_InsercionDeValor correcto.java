package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedSetCapacidadeKG_InsercionDeValor correcto {

    @Test
    public void setCapacidadeKG_InsercionDeValor

    correcto() {
        String capacidade = "500kg";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidade);
        assertEquals(capacidade, obj.getCapacidadeKG());
    }

}