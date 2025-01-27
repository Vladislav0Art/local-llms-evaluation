package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeKG DevolverValorCorretoDeCapacidadeKg {

    @Test
    public void getCapacidadeKG

    DevolverValorCorretoDeCapacidadeKg() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKg = "500kg";
        instance.setCapacidadeKG(capacidadeKg);
        assertEquals("500kg", instance.getCapacidadeKG());
    }

}