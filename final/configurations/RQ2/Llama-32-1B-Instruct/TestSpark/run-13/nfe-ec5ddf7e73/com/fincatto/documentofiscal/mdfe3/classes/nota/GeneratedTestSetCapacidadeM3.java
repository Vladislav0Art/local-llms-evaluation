package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.DFStringValidador;

public class GeneratedTestSetCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque instance;
    private DFStringValidador dfStringValidador;
    private Element element;

    @BeforeEach
    public void setup() {
        instance = new MDFInfoModalRodoviarioVeiculoReboque();
        dfStringValidador = new DFStringValidador();
        element = new Element("nota");
        instance.setCapacidadeKG(dfStringValidador.validate(element.get("capacidade_kg")));
    }

    @Test
    public void testSetCapacidadeM3() {
        // Given
        String capacidadeM3 = "20m";

        // When
        instance.setCapacidadeM3(capacidadeM3);

        // Then
        assertEquals(capacidadeM3, instance.getCapacidadeM3());
    }

}