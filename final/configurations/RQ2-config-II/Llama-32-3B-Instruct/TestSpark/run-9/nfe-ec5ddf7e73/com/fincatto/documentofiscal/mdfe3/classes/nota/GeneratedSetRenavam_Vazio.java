package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class GeneratedSetRenavam_Vazio {

    @Test
    public void setRenavam_Vazio() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam("");
        assertEquals("", mdf.getRenavam());
    }

}