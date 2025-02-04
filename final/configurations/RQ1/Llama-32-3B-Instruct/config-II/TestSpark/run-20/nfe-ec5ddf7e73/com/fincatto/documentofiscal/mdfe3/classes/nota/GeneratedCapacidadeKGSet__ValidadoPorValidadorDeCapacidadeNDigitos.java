package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedCapacidadeKGSet__ValidadoPorValidadorDeCapacidadeNDigitos {

    @Test
    public void capacidadeKGSet__ValidadoPorValidadorDeCapacidadeNDigitos() {
        final String capacidadeKG = "123456789012";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("5000", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeKG());
    }

}