package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetCapacidadeKG CapacidadeNDigitosEsperada {

    @Test
    public void setCapacidadeKG

    CapacidadeNDigitosEsperada() {
        // given
        final String capacidadeKG = "12345";
        when(DFStringValidador.capacidadeNDigitos(capacidadeKG, "Capacidade em KG reboque", 5)).thenReturn("capacidade_nd_digitos_capacidadeKg");

        // when
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);

        // then
        assertEquals("capacidade_nd_digitos_capacidadeKg", obj.getCapacidadeKG());
    }

}