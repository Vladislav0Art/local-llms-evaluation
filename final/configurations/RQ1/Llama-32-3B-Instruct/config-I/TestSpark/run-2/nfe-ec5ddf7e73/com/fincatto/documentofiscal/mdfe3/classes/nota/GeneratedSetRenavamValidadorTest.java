package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetRenavamValidadorTest {

    @Test
    public void setRenavamValidadorTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavamInvalido = "123456789";
        obj.setRenavam(renavamInvalido);
        assertTrue("Renavam invalido", DFStringValidador.validaIntervalo(renavamInvalido, 9, 11, "Renavam do reboque") == null);
    }

}