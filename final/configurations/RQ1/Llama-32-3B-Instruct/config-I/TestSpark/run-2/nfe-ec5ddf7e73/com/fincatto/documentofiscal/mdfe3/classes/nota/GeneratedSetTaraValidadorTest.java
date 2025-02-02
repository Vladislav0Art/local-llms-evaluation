package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetTaraValidadorTest {

    @Test
    public void setTaraValidadorTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraInvalido = "12345";
        obj.setTara(taraInvalido);
        assertTrue("Tara invalido", DFStringValidador.capacidadeNDigitos(taraInvalido, "Tara em reboque", 5) == null);
    }

}