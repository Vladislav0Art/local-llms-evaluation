package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestSetTara {

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque instance;

    @Mock
    private DFStringValidador dfStringValidador;

    @Test
    public void testSetTara() {
        String tara = "GHI789";
        instance.setTara(tara);
        assertEquals(tara, instance.getTara());
    }

}