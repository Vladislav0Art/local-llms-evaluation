package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetTara_VerificaValorComValidacao {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setTara_VerificaValorComValidacao() {
        String tara = "XYZ789";
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        dfStringValidador.validate(tara, "XYZ789");
    }

}