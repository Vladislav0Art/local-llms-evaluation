package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedPlacaSet deveNaoValidarPlacaDeReboqueQuandoInvalida {

    @Test
    public void placaSet

    deveNaoValidarPlacaDeReboqueQuandoInvalida() {
        String placa = "AAA-B";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        try {
            objeto.setPlaca(placa);
            assert false;
        } catch (Exception e) {
        }
    }

}