package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestDecode {

    private Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void testDecode() throws Exception {
        Object msg = new Object();

        Object result = gt06ProtocolDecoder.decode(null, null, msg);

        assertEquals(null, result);
    }

}