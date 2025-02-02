package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedTestCapacidadeKG {

    private int capacidade;

    public CapacidadeKG(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
}

public class CapacidadeM3 {
    private int capacidade;

    public CapacidadeM3(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
}

import org.junit.Test;

public class TestesCapacidade {

    @Test
    public void testCapacidadeKG() {
        CapacidadeKG capacidadeKg = new CapacidadeKG(100);
        assertEquals(100, capacidadeKg.getCapacidade());
        capacidadeKg.setCapacidade(200);
        assertEquals(200, capacidadeKg.getCapacidade());
    }

}