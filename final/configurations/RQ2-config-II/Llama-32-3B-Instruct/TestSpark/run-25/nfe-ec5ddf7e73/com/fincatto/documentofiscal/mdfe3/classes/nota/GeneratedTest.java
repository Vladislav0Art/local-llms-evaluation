package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void codigoInternoSet_Satisfactorio_DadoValorValido() {
        String codigoInterno = "codigo_interno";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, objeto.getCodigoInterno());
    }

    @Test
    public void codigoInternoSet_No_Satisfactorio_DadoValorInvalido() {
        String codigoInterno = "codigo_invalido";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(codigoInterno);
        assertFalse(resultado);
    }

    @Test
    public void placaSet_Satisfactorio_DadoValorValido() {
        String placa = "placa";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setPlaca(placa);
        assertEquals(placa, objeto.getPlaca());
    }

    @Test
    public void placaSet_No_Satisfactorio_DadoValorInvalido() {
        String placa = "placa_invalida";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(placa);
        assertFalse(resultado);
    }

    @Test
    public void renavamSet_Satisfactorio_DadoValorValido() {
        String renavam = "renavam";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setRenavam(renavam);
        assertEquals(renavam, objeto.getRenavam());
    }

    @Test
    public void renavamSet_No_Satisfactorio_DadoValorInvalido() {
        String renavam = "renavam_invalida";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(renavam);
        assertFalse(resultado);
    }

    @Test
    public void taraSet_Satisfactorio_DadoValorValido() {
        String tara = "tara";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setTara(tara);
        assertEquals(tara, objeto.getTara());
    }

    @Test
    public void taraSet_No_Satisfactorio_DadoValorInvalido() {
        String tara = "tara_invalida";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validador = new DFStringValidador();
        boolean resultado = validador.validar(tara);
        assertFalse(resultado);
    }

    @Test
    public void capacidadeKGGet_Satisfactorio_DadoValorValido() {
        String capacidadeKG = "capacidade_kg";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, objeto.getCapacidadeKG());
    }

    @Test
    public void capacidadeKGSet_Satisfactorio_DadoValorValido() {
        String capacidadeKG = "capacidade_kg";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, objeto.getCapacidadeKG());
    }

    @Test
    public void capacidadeM3Get_Satisfactorio_DadoValorValido() {
        String capacidadeM3 = "capacidade_m3";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, objeto.getCapacidadeM3());
    }

    @Test
    public void capacidadeM3Set_Satisfactorio_DadoValorValido() {
        String capacidadeM3 = "capacidade_m3";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, objeto.getCapacidadeM3());
    }

}