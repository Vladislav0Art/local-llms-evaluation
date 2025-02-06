package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCodigoInterno_ValidadorNãoEntendido_Test {

    @Test
    public void setCodigoInterno_ValidadorNãoEntendido_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean sucesso = true;
        DFStringValidador validador = new DFStringValidador(sucesso, "Valor não entendido");
        obj.setCodigoInterno(validador);
    }

}