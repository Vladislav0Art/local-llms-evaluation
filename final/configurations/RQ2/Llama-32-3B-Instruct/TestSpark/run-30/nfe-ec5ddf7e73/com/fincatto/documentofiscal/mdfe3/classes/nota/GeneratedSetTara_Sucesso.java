package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetTara_Sucesso {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setTara_Sucesso() {
        String tara = "XYZ789";
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assert (mdfInfoModalRodoviarioVeiculoReboque.getTara().equals(tara));
    }

}

public class DFStringValidador {

    public boolean validate(String codigo, String renavam) {
        return false;
    }

}