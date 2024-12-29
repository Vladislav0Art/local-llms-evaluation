package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodeMessageWithNoDataAndEmptyResponseTest {

    @Test
    public void decodeDecodeMessageWithNoDataAndEmptyResponseTest() {
        // Setup
        Protocol protocol = Mockito.mock(Protocol.class);
        BitBuffer bitBuffer = new BitBuffer();
        Object msg = null;

        // Execution
        Object result = ((GalileoProtocolDecoder) protocol).decode(null, null, msg);

        // Verification
        assertNull(result);
    }

}