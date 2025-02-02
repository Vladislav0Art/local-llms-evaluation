package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setTara][Invalid]

Test {

    @Test
    public void [setTara][Invalid]Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara("123456789a");
        assertFalse(DFStringValidador.capacidadeNDigitos(obj.getTara(), "Tara em reboque", 5));
    }

}