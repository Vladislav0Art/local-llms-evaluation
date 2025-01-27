package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetPlaca_Vazio_Test {

    @Test
    public void setPlaca_Vazio_Test() {
        String placa = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}