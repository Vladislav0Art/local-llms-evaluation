package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedGetCapacidadeM3_test {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCapacidadeM3_test() {
        String capacidadeM3 = "12";
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, obj.getCapacidadeM3());
    }

}