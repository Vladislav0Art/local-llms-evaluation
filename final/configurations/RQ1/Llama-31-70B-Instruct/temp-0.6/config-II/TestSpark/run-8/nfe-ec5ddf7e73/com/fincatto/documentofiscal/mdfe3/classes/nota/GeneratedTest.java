package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_null_shouldThrowException() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(null));
    }

    @Test
    public void setCodigoInterno_invalidLength_shouldThrowException() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(IllegalArgumentException.class, () -> mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("1234567891011"));
    }

}