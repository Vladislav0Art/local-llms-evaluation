package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;

public class Generated[setPlaca][PlacaDeVeiculo]

Test {

    @Test
    public void [setPlaca][PlacaDeVeiculo]Test() {
        final String placa = "ABC123";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setPlaca(placa);
        assertEquals(placa, object.getPlaca());
    }

}