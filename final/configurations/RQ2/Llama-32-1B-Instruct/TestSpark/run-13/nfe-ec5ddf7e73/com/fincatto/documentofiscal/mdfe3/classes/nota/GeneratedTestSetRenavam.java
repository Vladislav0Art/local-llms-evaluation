package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.DFStringValidador;

public class GeneratedTestSetRenavam {

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
    public void testSetRenavam() {
        // Given
        String renavam = "DEF456";

        // When
        instance.setRenavam(renavam);

        // Then
        assertEquals(renavam, instance.getRenavam());
    }

}