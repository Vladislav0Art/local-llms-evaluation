package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedSetTara_digitoVálidoTest {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setTara_digitoVálidoTest() {
        String tara = "12345";
        obj.setTara(tara);
        assertTrue(DFStringValidador.capacidadeNDigitos(tara, "Tara em reboque", 5));
    }

}