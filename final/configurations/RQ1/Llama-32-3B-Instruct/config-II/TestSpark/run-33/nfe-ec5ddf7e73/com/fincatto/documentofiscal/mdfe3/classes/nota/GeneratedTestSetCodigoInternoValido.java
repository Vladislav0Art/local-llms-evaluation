package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedTestSetCodigoInternoValido {

    @Test
    public void testSetCodigoInternoValido() {
        String codigoInterno = UUID.randomUUID().toString();
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCodigoInterno(codigoInterno);
        assertTrue(DFStringValidador.validador(codigoInterno, "Codigo interno Veiculo Reboque", 10, false, false));
    }

}