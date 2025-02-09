package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetCapacidadeKG_AlternarCapacidadeKg deveAlterar capacidadekg {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCapacidadeKG_AlternarCapacidadeKg

    deveAlterar capacidadekg() {
        String alterado = "2.5";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}