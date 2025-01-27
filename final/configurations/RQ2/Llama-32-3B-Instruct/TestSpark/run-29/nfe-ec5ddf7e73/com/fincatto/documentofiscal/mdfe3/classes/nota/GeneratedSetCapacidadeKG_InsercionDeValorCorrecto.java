package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedSetCapacidadeKG_InsercionDeValorCorrecto {

    @Test
    public void setCapacidadeKG_InsercionDeValorCorrecto() {
        String capacidade = "500kg";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidade);
        assertEquals(capacidade, obj.getCapacidadeKG());
    }

}