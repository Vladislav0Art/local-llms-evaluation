package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedSetRenavamSetValidString_SetCorrectly {

    @Test
    public void setRenavamSetValidString_SetCorrectly() {
        final String renavam = "1234567890";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setRenavam(renavam);
        assertTrue(DFStringValidador.isValido(renavam));
    }

}