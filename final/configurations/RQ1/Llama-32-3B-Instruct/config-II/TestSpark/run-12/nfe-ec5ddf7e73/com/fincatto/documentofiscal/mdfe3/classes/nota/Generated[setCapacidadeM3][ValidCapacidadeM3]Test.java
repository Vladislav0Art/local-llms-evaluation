package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setCapacidadeM3][ValidCapacidadeM3]

Test {

    @Test
    public void [setCapacidadeM3][ValidCapacidadeM3]Test() {
        String capacidadeM3 = "100";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertTrue(DFStringValidador.capacidadeNDigitos(capacidadeM3, "Capacidade em M3 reboque", 2));
    }

}