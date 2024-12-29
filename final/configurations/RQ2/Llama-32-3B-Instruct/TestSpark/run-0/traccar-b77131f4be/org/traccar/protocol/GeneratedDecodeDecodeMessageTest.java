package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodeMessageTest {

    @Test
    public void decodeDecodeMessageTest() {
        // Setup
        Protocol protocol = Mockito.mock(Protocol.class);
        BitBuffer bitBuffer = new BitBuffer();
        Object msg = bitBuffer;

        // Execution
        Object result = ((GalileoProtocolDecoder) protocol).decode(null, null, msg);

        // Verification
        assertTrue(result instanceof NetworkMessage);
    }

}