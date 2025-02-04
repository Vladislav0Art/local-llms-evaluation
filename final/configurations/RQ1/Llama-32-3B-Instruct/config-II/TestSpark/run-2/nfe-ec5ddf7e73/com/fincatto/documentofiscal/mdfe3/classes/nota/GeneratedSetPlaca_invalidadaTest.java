package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedSetPlaca_invalidadaTest {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setPlaca_invalidadaTest() {
        String placa = "";
        obj.setPlaca(placa);
        assertFalse(DFStringValidador.placaDeVeiculo(placa, "Placa do reboque"));
    }

}