package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedPlacaSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia {

    @Test
    public void placaSet__ValidadoDevidoALaPropriaInicializacao__NãoNulaNorVazia() {
        final String placa = "ABC123";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals("ABC123", new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

}