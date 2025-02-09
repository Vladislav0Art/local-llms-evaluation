package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedGetCapacidadeKG_devolverCapacidadeKg {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCapacidadeKG_devolverCapacidadeKg() {
        String capacidadeKg = "capacidadeKg";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKg(capacidadeKg);
        assertEquals(capacidadeKg, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKg());
    }

}