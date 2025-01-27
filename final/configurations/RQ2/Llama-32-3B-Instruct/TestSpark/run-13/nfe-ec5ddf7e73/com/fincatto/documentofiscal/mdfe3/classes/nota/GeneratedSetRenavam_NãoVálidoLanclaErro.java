package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetRenavam_NãoVálidoLanclaErro {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setRenavam_NãoVálidoLanclaErro() {
        String renavam = "xyz";
        when(validador.validar(renavam)).thenReturn(false);
        try {
            objetoDeTeste.setRenavam(renavam);
            assert false;
        } catch (Exception e) {
        }
    }

}