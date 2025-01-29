package com.fincatto.documentofiscal.mdfe3.classes.nota;

import java.util.function.Function;

public class GeneratedTestGetCapacidadeM3 {

    public static String getCapacidadeKG(String tipo) {
        return " capacity KG: " + tipo;
    }

    public static String getCapacidadeM3(String tipo) {
        return " capacity M3: " + tipo;
    }
}

public class Test {

    @Test
    public void testGetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = mdf.getCapacidadeM3("capacidade M3");
        assertEquals("capacity M3: capacidade M3", capacidadeM3);
    }

}