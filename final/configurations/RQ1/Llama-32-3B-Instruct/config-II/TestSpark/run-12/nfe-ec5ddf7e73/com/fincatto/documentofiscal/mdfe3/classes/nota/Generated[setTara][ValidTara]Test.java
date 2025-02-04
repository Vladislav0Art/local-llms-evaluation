package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setTara][ValidTara]

Test {

    @Test
    public void [setTara][ValidTara]Test() {
        String tara = "1000";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertTrue(DFStringValidador.capacidadeNDigitos(tara, "Tara em reboque", 5));
    }

}