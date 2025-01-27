package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetRenavam_VerificaValorComValidacao {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setRenavam_VerificaValorComValidacao() {
        String renavam = "ABC456";
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        dfStringValidador.validate(renavam, "ABC456");
    }

}