package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setCapacidadeKG][Empty]

Test {

    @Test
    public void [setCapacidadeKG][Empty]Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("");
        assertTrue(DFStringValidador.capacidadeNDigitos(obj.getCapacidadeKG(), "Capacidade em KG reboque", 5));
    }

}