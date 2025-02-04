package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GeneratedCapacidadeM3Set deveValidarCapacidadeDoReboque {

    @Mock
    private DFStringValidador validador;

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;
    private String valorCapacidadeKg;
    private boolean valorPlacaVeiculoReboque;
    private int valorRenavamDoReboque;
    private String valorTaraEmReboque;

    public MDFInfoModalRodoviarioVeiculoReboqueTest(String valorCapacidadeKg, boolean valorPlacaVeiculoReboque, int valorRenavamDoReboque, String valorTaraEmReboque) {
        MockitoAnnotations.initMocks(this);
        this.valorCapacidadeKg = valorCapacidadeKg;
        this.valorPlacaVeiculoReboque = valorPlacaVeiculoReboque;
        this.valorRenavamDoReboque = valorRenavamDoReboque;
        this.valorTaraEmReboque = valorTaraEmReboque;

        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Parameters
    public static Object[] data() {
        return new Object[][]{
                {"12345", true, 9, "10"},
                {"12345", false, 0, "5"},
                {"12345", true, 9, ""},
                {"12345", true, 9, "abc"}
        };
    }

    @Test
    public void capacidadeM3Set

    deveValidarCapacidadeDoReboque() {
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3("123");
        assertEquals(2, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3().length());
    }

}