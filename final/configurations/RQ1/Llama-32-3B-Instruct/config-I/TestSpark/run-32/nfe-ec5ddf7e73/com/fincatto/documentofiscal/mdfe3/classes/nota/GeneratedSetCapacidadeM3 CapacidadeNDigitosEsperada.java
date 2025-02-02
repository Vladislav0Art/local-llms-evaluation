package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetCapacidadeM3 CapacidadeNDigitosEsperada {

    @Test
    public void setCapacidadeM3

    CapacidadeNDigitosEsperada() {
        // given
        final String capacidadeM3 = "123";
        when(DFStringValidador.capacidadeNDigitos(capacidadeM3, "Capacidade em M3 reboque", 2)).thenReturn("capacidade_nd_digitos_capacidadeM3");

        // when
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);

        // then
        assertEquals("capacidade_nd_digitos_capacidadeM3", obj.getCapacidadeM3());
    }

}