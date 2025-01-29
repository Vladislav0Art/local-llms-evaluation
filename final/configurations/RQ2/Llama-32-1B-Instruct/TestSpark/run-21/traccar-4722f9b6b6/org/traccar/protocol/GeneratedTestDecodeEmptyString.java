package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecodeEmptyString {

    @Test
    public void testDecodeEmptyString() {
        watchProtocolDecoder.decode(TEST_STRING, null, null);
        verifyNoException();
    }

}