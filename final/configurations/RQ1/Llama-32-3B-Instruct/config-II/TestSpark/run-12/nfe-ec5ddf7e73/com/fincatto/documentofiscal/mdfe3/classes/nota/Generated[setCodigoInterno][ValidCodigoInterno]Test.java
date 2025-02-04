package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setCodigoInterno][ValidCodigoInterno]

Test {

    @Test
    public void [setCodigoInterno][ValidCodigoInterno]Test() {
        String codigoInterno = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertTrue(DFStringValidador.validador(codigoInterno, "Codigo interno Veiculo Reboque", 10, false, false));
    }

}