package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestSetRenavamValido {

    @Test
    public void testSetRenavamValido() {
        String renavam = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setRenavam(renavam);
        assertTrue(DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque"));
    }

}