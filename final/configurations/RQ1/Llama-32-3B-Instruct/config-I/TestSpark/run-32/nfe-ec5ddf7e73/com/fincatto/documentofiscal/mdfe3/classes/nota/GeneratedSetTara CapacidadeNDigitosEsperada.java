package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetTara CapacidadeNDigitosEsperada {

    @Test
    public void setTara

    CapacidadeNDigitosEsperada() {
        // given
        final String tara = "12345";
        when(DFStringValidador.capacidadeNDigitos(tara, "Tara em reboque", 5)).thenReturn("capacidade_nd_digitos_tara");

        // when
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);

        // then
        assertEquals("capacidade_nd_digitos_tara", obj.getTara());
    }

}