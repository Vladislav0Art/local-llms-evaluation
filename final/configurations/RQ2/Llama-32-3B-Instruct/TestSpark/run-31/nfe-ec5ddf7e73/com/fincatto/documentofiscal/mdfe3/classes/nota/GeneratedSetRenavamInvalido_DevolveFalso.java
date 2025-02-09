package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetRenavamInvalido_DevolveFalso {

    @Test
    public void setRenavamInvalido_DevolveFalso() {
        String renavam = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertFalse(resultado);
    }

}