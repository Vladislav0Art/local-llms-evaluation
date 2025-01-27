package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCapacidadeKG RetornaValorCorreto {

    @Mock
    private DFStringValidador stringValidador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    public void setCodigoInterno(String codigoInterno) {
        // implementation
    }

    public void setPlaca(String placa) {
        // implementation
    }

    public void setRenavam(String renavam) {
        // implementation
    }

    public void setTara(String tara) {
        // implementation
    }

    public String getCapacidadeKG() {
        // implementation
    }

    public void setCapacidadeKG(String capacidadeKG) {
        // implementation
    }

    @Test
    public void getCapacidadeKG

    RetornaValorCorreto() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("10");
        String valor = obj.getCapacidadeKG();
        assertEquals("10", valor);
    }

}