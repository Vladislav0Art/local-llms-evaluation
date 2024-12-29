package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodeMessageWithInvalidDataTest {

    @Test
    public void decodeDecodeMessageWithInvalidDataTest() {
        // Setup
        Protocol protocol = Mockito.mock(Protocol.class);
        BitBuffer bitBuffer = new BitBuffer();
        Object msg = bitBuffer;

        // Execution
        try {
            ((GalileoProtocolDecoder) protocol).decode(null, null, msg);
            fail("Expected Exception");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

}