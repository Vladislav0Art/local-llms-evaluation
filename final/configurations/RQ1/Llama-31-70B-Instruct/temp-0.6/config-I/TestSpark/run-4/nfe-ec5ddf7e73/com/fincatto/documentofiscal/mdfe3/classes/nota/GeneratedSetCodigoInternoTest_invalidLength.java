package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInternoTest_invalidLength {

    @Test
    public void setCodigoInternoTest_invalidLength() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("12345678901234567890");
    }

}