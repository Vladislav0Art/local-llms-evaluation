package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedGetCapacidadeKG_test {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCapacidadeKG_test() {
        String capacidadeKG = "12345";
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, obj.getCapacidadeKG());
    }

}