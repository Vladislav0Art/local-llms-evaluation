package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoVersion_6 {

    @Test
    public void testDecode_GalileoVersion_6() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 6.0");
        assertEquals("Galileo: 6.0", (String) result);
    }

}