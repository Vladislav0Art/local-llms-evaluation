package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setCapacidadeKG][ValidCapacidadeKG]

Test {

    @Test
    public void [setCapacidadeKG][ValidCapacidadeKG]Test() {
        String capacidadeKG = "1000";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertTrue(DFStringValidador.capacidadeNDigitos(capacidadeKG, "Capacidade em KG reboque", 5));
    }

}