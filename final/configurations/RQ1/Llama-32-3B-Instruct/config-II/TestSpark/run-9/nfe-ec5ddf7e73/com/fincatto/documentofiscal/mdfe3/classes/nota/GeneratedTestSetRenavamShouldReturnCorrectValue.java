package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestSetRenavamShouldReturnCorrectValue {

    @Test
    public void testSetRenavamShouldReturnCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = RENAVAM_VEICULO_REBOQUE;
        obj.setRenavam(renavam);
        assertThat(obj.getRenavam(), is(RENAVAM_VEICULO_REBOQUE));
    }

}