package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCodigoInterno_VerificaValorComValidacao {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInterno_VerificaValorComValidacao() {
        String codigoInterno = "123456";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        dfStringValidador.validate(codigoInterno, "123456");
    }

}