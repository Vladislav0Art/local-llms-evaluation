package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedTest_getCapacidadeKG_CapacidadeKG {

    @Test
    public void test_getCapacidadeKG_CapacidadeKG() {
        String capacidadeKG = "MNO345";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

}