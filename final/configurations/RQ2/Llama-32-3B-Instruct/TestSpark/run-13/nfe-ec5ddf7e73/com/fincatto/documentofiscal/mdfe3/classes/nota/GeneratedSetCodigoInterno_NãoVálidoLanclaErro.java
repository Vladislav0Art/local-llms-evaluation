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
public class GeneratedSetCodigoInterno_NãoVálidoLanclaErro {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setCodigoInterno_NãoVálidoLanclaErro() {
        String codigoInterno = "abcde";
        when(validador.validar(codigoInterno)).thenReturn(false);
        try {
            objetoDeTeste.setCodigoInterno(codigoInterno);
            assert false;
        } catch (Exception e) {
        }
    }

}