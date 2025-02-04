package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setPlaca][ValidPlaca]

Test {

    @Test
    public void [setPlaca][ValidPlaca]Test() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertTrue(DFStringValidador.placaDeVeiculo(placa, "Placa do reboque"));
    }

}