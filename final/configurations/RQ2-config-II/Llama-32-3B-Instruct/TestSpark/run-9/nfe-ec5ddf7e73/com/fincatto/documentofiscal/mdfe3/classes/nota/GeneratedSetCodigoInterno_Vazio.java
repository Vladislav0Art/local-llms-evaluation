package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

public class GeneratedSetCodigoInterno_Vazio {

    @Test
    public void setCodigoInterno_Vazio() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno("");
        assertEquals("", mdf.getCodigoInterno());
    }

}