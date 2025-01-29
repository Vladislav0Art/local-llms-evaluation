package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoVersion_7 {

    @Test
    public void testDecode_GalileoVersion_7() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 7.0");
        assertEquals("Galileo: 7.0", (String) result);
    }

}