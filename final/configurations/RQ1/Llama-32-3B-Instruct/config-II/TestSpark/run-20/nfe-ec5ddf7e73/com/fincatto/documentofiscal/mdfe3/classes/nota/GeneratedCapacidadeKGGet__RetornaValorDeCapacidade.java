package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedCapacidadeKGGet__RetornaValorDeCapacidade {

    @Test
    public void capacidadeKGGet__RetornaValorDeCapacidade() {
        final String capacidadeKG = "5000";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("5000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}