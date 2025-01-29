package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetCapacidadeM3 {

    @Test
    public void testGetCapacidadeM3() {
        String capacidadeM3 = "100m";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque =
                new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}