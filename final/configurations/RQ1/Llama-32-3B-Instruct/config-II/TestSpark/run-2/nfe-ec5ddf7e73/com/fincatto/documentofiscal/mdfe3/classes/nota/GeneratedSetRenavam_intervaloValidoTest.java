package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedSetRenavam_intervaloValidoTest {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setRenavam_intervaloValidoTest() {
        String renavam = "123456789";
        obj.setRenavam(renavam);
        assertTrue(DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque"));
    }

}