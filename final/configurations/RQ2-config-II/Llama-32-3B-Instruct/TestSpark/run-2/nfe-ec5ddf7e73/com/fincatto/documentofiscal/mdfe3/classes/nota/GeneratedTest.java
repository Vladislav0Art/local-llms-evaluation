package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_ValidadorNãoEntendido_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean sucesso = true;
        DFStringValidador validador = new DFStringValidador(sucesso, "Valor não entendido");
        obj.setCodigoInterno(validador);
    }

    @Test
    public void setPlaca_ValidadorNãoEntendido_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean sucesso = true;
        DFStringValidador validador = new DFStringValidador(sucesso, "Valor não entendido");
        obj.setPlaca(validador);
    }

    @Test
    public void setRenavam_ValidadorNãoEntendido_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean sucesso = true;
        DFStringValidador validador = new DFStringValidador(sucesso, "Valor não entendido");
        obj.setRenavam(validador);
    }

    @Test
    public void setTara_ValidadorNãoEntendido_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean sucesso = true;
        DFStringValidador validador = new DFStringValidador(sucesso, "Valor não entendido");
        obj.setTara(validador);
    }

    @Test
    public void getCapacidadeKG_MensagemNaoEntendida_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String mensagem = "Mensagem não entendida";
        assertEquals(mensagem, obj.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_MensagemNaoEntendida_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String mensagem = "Mensagem não entendida";
        obj.setCapacidadeKG(mensagem);
    }

    @Test
    public void getCapacidadeM3_MensagemNaoEntendida_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String mensagem = "Mensagem não entendida";
        assertEquals(mensagem, obj.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_MensagemNaoEntendida_Test() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String mensagem = "Mensagem não entendida";
        obj.setCapacidadeM3(mensagem);
    }

}