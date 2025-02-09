package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetRenavamValido_DevolveSatisfatorio {

    @Test
    public void setRenavamValido_DevolveSatisfatorio() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertTrue(resultado);
    }

}