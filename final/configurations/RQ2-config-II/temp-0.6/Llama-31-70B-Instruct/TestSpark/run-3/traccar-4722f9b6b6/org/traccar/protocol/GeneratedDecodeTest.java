package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        // Given
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

        // When
        Object decode = watchProtocolDecoder.decode(null, null, null);

        // Then
        assertEquals(null, decode);
    }

}