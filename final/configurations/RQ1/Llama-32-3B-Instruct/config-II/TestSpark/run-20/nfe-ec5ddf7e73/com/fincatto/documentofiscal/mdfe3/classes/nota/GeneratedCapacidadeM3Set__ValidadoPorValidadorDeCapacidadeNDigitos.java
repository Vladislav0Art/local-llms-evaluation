package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedCapacidadeM3Set__ValidadoPorValidadorDeCapacidadeNDigitos {

    @Test
    public void capacidadeM3Set__ValidadoPorValidadorDeCapacidadeNDigitos() {
        final String capacidadeM3 = "12345678901234";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("100", new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}