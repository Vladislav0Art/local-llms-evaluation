package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodePositionWithInvalidDataAndEmptyResponseTest {

    @Test
    public void decodeDecodePositionWithInvalidDataAndEmptyResponseTest() {
        // Setup
        Protocol protocol = Mockito.mock(Protocol.class);
        BitBuffer bitBuffer = new BitBuffer();
        Position position = new Position();

        // Execution
        try {
            ((GalileoProtocolDecoder) protocol).decode(null, null, bitBuffer);
            fail("Expected Exception");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
        }
    }

}