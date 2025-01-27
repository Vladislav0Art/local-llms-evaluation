package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetTara_Vazio_Test {

    @Test
    public void setTara_Vazio_Test() {
        String tara = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}