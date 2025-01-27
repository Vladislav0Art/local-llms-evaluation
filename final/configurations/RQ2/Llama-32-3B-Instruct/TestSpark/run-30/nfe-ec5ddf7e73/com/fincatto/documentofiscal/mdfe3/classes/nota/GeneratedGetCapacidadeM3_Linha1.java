package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCapacidadeM3_Linha1 {

    @Mock
    private DFStringValidador dfStringValidador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void getCapacidadeM3_Linha1() {
        String capacidadeM3 = "20";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assert (mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3().equals(capacidadeM3));
    }

}