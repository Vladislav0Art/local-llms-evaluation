package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetTaraValido_DevolveSatisfatorio {

    @Test
    public void setTaraValido_DevolveSatisfatorio() {
        String tara = "1000kg";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertTrue(resultado);
    }

}