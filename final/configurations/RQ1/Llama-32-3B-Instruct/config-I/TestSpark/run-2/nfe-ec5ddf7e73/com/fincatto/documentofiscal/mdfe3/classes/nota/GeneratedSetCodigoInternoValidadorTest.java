package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCodigoInternoValidadorTest {

    @Test
    public void setCodigoInternoValidadorTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInternoInvalido = "12345";
        obj.setCodigoInterno(codigoInternoInvalido);
        assertTrue("Codigo interno invalido", DFStringValidador.validador(codigoInternoInvalido, "Codigo interno Veiculo Reboque", 10, false, false) == null);
    }

}