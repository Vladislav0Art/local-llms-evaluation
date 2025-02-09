package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedGetCapacidadeM3_devolverCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCapacidadeM3_devolverCapacidadeM3() {
        String capacidade = "0.5";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidade);
        assertEquals(capacidade, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}