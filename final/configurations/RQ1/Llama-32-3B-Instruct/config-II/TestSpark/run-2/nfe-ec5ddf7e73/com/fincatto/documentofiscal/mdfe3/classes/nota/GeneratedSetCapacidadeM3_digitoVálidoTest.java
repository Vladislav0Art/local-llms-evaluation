package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedSetCapacidadeM3_digitoVálidoTest {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCapacidadeM3_digitoVálidoTest() {
        String capacidadeM3 = "12";
        obj.setCapacidadeM3(capacidadeM3);
        assertTrue(DFStringValidador.capacidadeNDigitos(capacidadeM3, "Capacidade em M3 reboque", 2));
    }

}