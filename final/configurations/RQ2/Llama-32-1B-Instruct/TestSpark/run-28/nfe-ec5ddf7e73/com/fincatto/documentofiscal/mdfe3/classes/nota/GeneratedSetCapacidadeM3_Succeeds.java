package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedSetCapacidadeM3_Succeeds {

    @Mock
    private Element element;

    @Test
    public void setCapacidadeM3_Succeeds() {
        // Arrange
        String capacidadeM3 = "0123456789";
        MockitoAnnotations.initMocks(this);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);

        // Act
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(element);

        // Assert
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}