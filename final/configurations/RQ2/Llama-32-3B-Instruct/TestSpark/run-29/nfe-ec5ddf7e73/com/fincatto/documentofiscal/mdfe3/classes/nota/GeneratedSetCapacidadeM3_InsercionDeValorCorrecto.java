package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class GeneratedSetCapacidadeM3_InsercionDeValorCorrecto {

    @Test
    public void setCapacidadeM3_InsercionDeValorCorrecto() {
        String capacidade = "200m3";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidade);
        assertEquals(capacidade, obj.getCapacidadeM3());
    }

}