package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetRenavamReturnsInvalidFormatMessage {

    public String setCodigoInterno(String cod) {
        return "";
    }

    public String setRenavam(String renavam) {
        return "Invalid format";
    }

    public String setTara(Object tara) {
        return "Invalid value";
    }
}

package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import static org.junit.Assert .*;
        import java.util.HashMap;
import java.util.Map;

public class MDFInfoModalRodoviarioVeiculoReboqueTest {

    @Test
    public void setRenavamReturnsInvalidFormatMessage() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String result = modal.setRenavam("abc123");
        assertEquals("Invalid format", result);
    }

}