package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInterno_AlternarcodigoInterno

    deveAlterar codigoInterno() {
        String alterado = "123456";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlaca_Alternarplaca

    deveAlterar placa() {
        String alterado = "ABC123";
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void setRenavam_Alternarenavam

    deveAlterar renavam() {
        String alterado = "123456";
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

    @Test
    public void setTara_Alternartara

    deveAlterar tara() {
        String alterado = "kg";
        mdfInfoModalRodoviarioVeiculoReboque.setTara(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void getCapacidadeKG_devolverCapacidadeKg() {
        String capacidadeKg = "capacidadeKg";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKg(capacidadeKg);
        assertEquals(capacidadeKg, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKg());
    }

    @Test
    public void setCapacidadeM3_AlternarCapacidadeM3

    deveAlterar capacidadeM3() {
        String capacidadeM3 = "capacidadeM3";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}