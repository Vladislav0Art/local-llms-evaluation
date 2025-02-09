package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetTara_Alternartara deveAlterar tara {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setTara_Alternartara

    deveAlterar tara() {
        String alterado = "kg";
        mdfInfoModalRodoviarioVeiculoReboque.setTara(alterado);
        assertEquals(alterado, mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

}