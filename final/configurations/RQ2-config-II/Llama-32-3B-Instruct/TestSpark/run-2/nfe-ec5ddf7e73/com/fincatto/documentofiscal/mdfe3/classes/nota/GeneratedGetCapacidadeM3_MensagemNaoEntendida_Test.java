package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCapacidadeM3_MensagemNaoEntendida_Test {

    @Test
    public void getCapacidadeM3_MensagemNaoEntendida_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String mensagem = "Mensagem não entendida";
        assertEquals(mensagem, obj.getCapacidadeM3());
    }

}