package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setRenavam][ValidRenavam]

Test {

    @Test
    public void [setRenavam][ValidRenavam]Test() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertTrue(DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque"));
    }

}