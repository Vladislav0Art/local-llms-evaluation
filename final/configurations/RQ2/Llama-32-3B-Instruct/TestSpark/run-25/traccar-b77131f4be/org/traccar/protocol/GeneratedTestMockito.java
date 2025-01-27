package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.mockito.MockitoJUnitRunner;

public class GeneratedTestMockito {

    @Test
    public void testMockito() {
        // mock object creation
        BaseProtocolDecoder decoder = mock(BaseProtocolDecoder.class);

        // method call
        when(decoder.getProtocol()).thenReturn("GALILEO");

        String result = (String) decoder.getProtocol();
        assertEquals(result, "GALILEO", 0);
    }

}