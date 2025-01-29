package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoVersion_4 {

    @Test
    public void testDecode_GalileoVersion_4() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 4.0");
        assertEquals("Galileo: 4.0", (String) result);
    }

}