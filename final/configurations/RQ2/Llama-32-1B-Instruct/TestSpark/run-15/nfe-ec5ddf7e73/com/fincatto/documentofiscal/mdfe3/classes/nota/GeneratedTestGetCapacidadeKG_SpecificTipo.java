package com.fincatto.documentofiscal.mdfe3.classes.nota;

import java.util.function.Function;

public class GeneratedTestGetCapacidadeKG_SpecificTipo {

    public static String getCapacidadeKG(String tipo) {
        return " capacity KG: " + tipo;
    }

    public static String getCapacidadeM3(String tipo) {
        return " capacity M3: " + tipo;
    }
}

public class Test {

    @Test
    public void testGetCapacidadeKG_SpecificTipo() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = mdf.getCapacidadeKG("capacidade KG");
        assertEquals("capacity KG: capacidad KG", capacidadeKG);
    }

}