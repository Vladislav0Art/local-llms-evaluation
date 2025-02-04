package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestSetTaraValida {

    @Test
    public void testSetTaraValida() {
        String tara = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setTara(tara);
        assertTrue(DFStringValidador.capacidadeNDigitos(tara, "Tara em reboque", 5));
    }

}