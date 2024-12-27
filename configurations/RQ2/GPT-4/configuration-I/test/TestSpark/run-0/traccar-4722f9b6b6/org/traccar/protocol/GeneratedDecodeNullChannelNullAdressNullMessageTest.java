package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.*;

public class GeneratedDecodeNullChannelNullAdressNullMessageTest {

    @Test
    public void decodeNullChannelNullAdressNullMessageTest() {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        try {
            Object result = decoder.decode(null, null, null);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

}