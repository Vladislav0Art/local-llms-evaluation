package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setTara_MDFInfoModalRodoviarioVeiculoReboque {

    @Mock
    private Element xmlElement;

    @Mock
    private DFStringValidador dfStringValidador;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_setTara_MDFInfoModalRodoviarioVeiculoReboque() {
        // Arrange
        String tara = "GHI789";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(xmlElement.getAttribute("tara")).thenReturn(tara);

        // Act
        instance.setTara(tara);

        // Assert
        assertEquals(tara, instance.getTara());
    }

}