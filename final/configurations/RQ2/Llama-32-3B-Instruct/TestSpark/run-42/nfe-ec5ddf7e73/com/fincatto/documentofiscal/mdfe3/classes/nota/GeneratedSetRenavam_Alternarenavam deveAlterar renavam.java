package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetRenavam_Alternarenavam deveAlterar renavam {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setRenavam_Alternarenavam

    deveAlterar renavam() {
        String alterado = "123456";
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}