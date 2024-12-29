package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecodeDecodeMessageWithNoDataAndNotEmptyResponseTest {

    @Test
    public void decodeDecodeMessageWithNoDataAndNotEmptyResponseTest() {
        // Setup
        Protocol protocol = Mockito.mock(Protocol.class);
        BitBuffer bitBuffer = new BitBuffer();
        Object msg = null;

        // Execution
        Object result = ((GalileoProtocolDecoder) protocol).decode(null, null, msg);

        // Verification
        assertNotNull(result);
    }

}