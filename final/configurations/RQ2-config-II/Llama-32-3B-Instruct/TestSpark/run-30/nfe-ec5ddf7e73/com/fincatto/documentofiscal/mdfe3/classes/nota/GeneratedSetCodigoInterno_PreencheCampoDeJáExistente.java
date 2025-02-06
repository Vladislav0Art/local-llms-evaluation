package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedSetCodigoInterno_PreencheCampoDeJáExistente {

    @Test
    public void setCodigoInterno_PreencheCampoDeJáExistente() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca("ABC123");
        obj.setCodigoInterno("DEF456");
        assertEquals("DEF456", obj.getCodigoInterno());
    }

}