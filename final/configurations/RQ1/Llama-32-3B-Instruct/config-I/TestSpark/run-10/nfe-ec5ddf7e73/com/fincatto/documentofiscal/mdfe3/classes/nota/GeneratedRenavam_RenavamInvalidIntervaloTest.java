package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedRenavam_RenavamInvalidIntervaloTest {

    @Test
    public void renavam_RenavamInvalidIntervaloTest() {
        final String renavam = "1234567890";
        assert false == DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque");
    }

}