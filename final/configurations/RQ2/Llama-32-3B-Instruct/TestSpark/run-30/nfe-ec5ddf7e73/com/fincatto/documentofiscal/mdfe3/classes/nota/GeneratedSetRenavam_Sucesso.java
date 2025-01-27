package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetRenavam_Sucesso {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setRenavam_Sucesso() {
        String renavam = "ABC456";
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assert (mdfInfoModalRodoviarioVeiculoReboque.getRenavam().equals(renavam));
    }

}