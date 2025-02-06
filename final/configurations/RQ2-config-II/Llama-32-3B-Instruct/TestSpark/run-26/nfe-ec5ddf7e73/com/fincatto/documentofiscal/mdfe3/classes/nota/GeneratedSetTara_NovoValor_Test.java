package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedSetTara_NovoValor_Test {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setTara_NovoValor_Test() {
        String tara = "tara";
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(tara, mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}