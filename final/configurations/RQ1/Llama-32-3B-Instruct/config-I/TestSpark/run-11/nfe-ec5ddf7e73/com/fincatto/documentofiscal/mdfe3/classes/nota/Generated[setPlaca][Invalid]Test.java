package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setPlaca][Invalid]

Test {

    @Test
    public void [setPlaca][Invalid]Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca("123456789a");
        assertFalse(DFStringValidador.placaDeVeiculo(obj.getPlaca(), "Placa do reboque"));
    }

}