package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class Generated[setCodigoInterno][Validador]

Test {

    @Element(name = "capKG")
    private String capacidadeKGMock = Mockito.mock(String.class);

    public void setCapacidadeKg ( final String capacidadeKG){
        capacidadeKGMock = capacidadeKG;
    }

    @Test
    public void [setCodigoInterno][Validador]Test() {
        final String codigoInterno = "12345678901";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertNotNull(DFStringValidador.validador(codigoInterno, "Codigo interno Veiculo Reboque", 10, false, false));
    }

}