package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestSetPlacaShouldReturnCorrectValue {

    @Test
    public void testSetPlacaShouldReturnCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = PLACA_VEICULO_REBOQUE;
        obj.setPlaca(placa);
        assertThat(obj.getPlaca(), is(PLACA_VEICULO_REBOQUE));
    }

}