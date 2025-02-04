package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedCapacidadeKGSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia {

    @Test
    public void capacidadeKGSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String capacidadeKG = "5000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("5000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}