package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedSetCodigoInterno_validadorTest {

    private MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInterno_validadorTest() {
        String codigoInterno = "1234567890";
        obj.setCodigoInterno(codigoInterno);
        assertTrue(DFStringValidador.validador(codigoInterno, "Codigo interno Veiculo Reboque", 10, false, false));
    }

}