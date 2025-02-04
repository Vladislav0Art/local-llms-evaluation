package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedSetCapacidadeKG_digitoVálidoTest {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCapacidadeKG_digitoVálidoTest() {
        String capacidadeKG = "12345";
        obj.setCapacidadeKG(capacidadeKG);
        assertTrue(DFStringValidador.capacidadeNDigitos(capacidadeKG, "Capacidade em KG reboque", 5));
    }

}