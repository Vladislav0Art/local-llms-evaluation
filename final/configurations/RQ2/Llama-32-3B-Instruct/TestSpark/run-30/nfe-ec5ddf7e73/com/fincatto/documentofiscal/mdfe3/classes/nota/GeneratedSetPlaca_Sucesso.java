package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetPlaca_Sucesso {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setPlaca_Sucesso() {
        String placa = "ABC123";
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assert (mdfInfoModalRodoviarioVeiculoReboque.getPlaca().equals(placa));
    }

}