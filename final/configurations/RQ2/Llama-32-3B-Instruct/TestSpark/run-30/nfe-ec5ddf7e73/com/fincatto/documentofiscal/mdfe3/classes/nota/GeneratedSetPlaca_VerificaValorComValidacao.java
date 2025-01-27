package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetPlaca_VerificaValorComValidacao {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setPlaca_VerificaValorComValidacao() {
        String placa = "ABC123";
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        dfStringValidador.validate(placa, "ABC123");
    }

}