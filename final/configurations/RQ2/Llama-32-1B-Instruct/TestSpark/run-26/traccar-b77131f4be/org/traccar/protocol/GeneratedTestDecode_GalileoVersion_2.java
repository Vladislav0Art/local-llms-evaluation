package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoVersion_2 {

    @Test
    public void testDecode_GalileoVersion_2() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 2.0");
        assertEquals("Galileo: 2.0", (String) result);
    }

}