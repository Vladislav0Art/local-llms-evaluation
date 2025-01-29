package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoVersion_5 {

    @Test
    public void testDecode_GalileoVersion_5() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 5.0");
        assertEquals("Galileo: 5.0", (String) result);
    }

}