package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestSetCodigoInternoValidation {

    @Test
    public void testSetCodigoInternoValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInternoInvalido = "123";
        boolean result = DFStringValidador.validador(codigoInternoInvalido, "Codigo interno Veiculo Reboque", 10, false, false);
        assertFalse(result);
    }

}