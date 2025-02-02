package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setCapacidadeM3][Empty]

Test {

    @Test
    public void [setCapacidadeM3][Empty]Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3("");
        assertTrue(DFStringValidador.capacidadeNDigitos(obj.getCapacidadeM3(), "Capacidade em M3 reboque", 2));
    }

}