package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedSetCodigoInterno_null_shouldThrowException {

    @Test
    public void setCodigoInterno_null_shouldThrowException() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(null));
    }

}