package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setRenavam][OutOfInterval]

Test {

    @Test
    public void [setRenavam][OutOfInterval]Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam("123456789");
        assertFalse(DFStringValidador.validaIntervalo(obj.getRenavam(), 9, 11, "Renavam do reboque"));
    }

}