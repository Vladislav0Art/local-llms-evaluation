package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodePositionWithNoDataAndEmptyResponseTest {

    @Test
    public void decodeDecodePositionWithNoDataAndEmptyResponseTest() {
        // Setup
        Protocol protocol = Mockito.mock(Protocol.class);
        BitBuffer bitBuffer = new BitBuffer();
        Position position = new Position();

        // Execution
        Object result = ((GalileoProtocolDecoder) protocol).decode(null, null, bitBuffer);

        // Verification
        assertNull(result);
    }

}