package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setTara {

    @Mock
    private Element xmlElement;

    @Mock
    private DFStringValidador dfStringValidador;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
    }

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque instance;

    @Test
    public void test_setTara() {
        // Arrange
        String tara = "GHI789";
        xmlElement.setAttribute("tara", tara);
        dfStringValidador.setTara(tara);

        // Act
        instance.setTara(tara);

        // Assert
        assertEquals(tara, instance.getTara());
    }

}