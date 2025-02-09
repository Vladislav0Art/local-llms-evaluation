package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetPlacaValido_DevolveSatisfatorio {

    @Test
    public void setPlacaValido_DevolveSatisfatorio() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertTrue(resultado);
    }

}