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
public class GeneratedSetPlaca_NãoVálidoLanclaErro {

    @Mock
    private DFStringValidador validador;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque objetoDeTeste;

    @Test
    public void setPlaca_NãoVálidoLanclaErro() {
        String placa = "xyz";
        when(validador.validar(placa)).thenReturn(false);
        try {
            objetoDeTeste.setPlaca(placa);
            assert false;
        } catch (Exception e) {
        }
    }

}