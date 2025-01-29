package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoVersion_1 {

    @Test
    public void testDecode_GalileoVersion_1() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 1.0");
        assertEquals("Galileo: 1.0", (String) result);
    }

}