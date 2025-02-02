package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class Generated[setCodigoInterno][Validador]

Test {

    @Test
    public void [setCodigoInterno][Validador]Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno("123456789");
        assertTrue(DFStringValidador.validador(obj.getCodigoInterno(), "Codigo interno Veiculo Reboque", 10, false, false));
    }

}