package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoVersion_3 {

    @Test
    public void testDecode_GalileoVersion_3() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 3.0");
        assertEquals("Galileo: 3.0", (String) result);
    }

}