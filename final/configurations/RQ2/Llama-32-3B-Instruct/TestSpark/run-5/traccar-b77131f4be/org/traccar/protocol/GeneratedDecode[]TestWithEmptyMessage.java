package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDecode[]

TestWithEmptyMessage {

    @Test
    public void decode[] TestWithEmptyMessage() throws Exception {
        Map<String, Object> parameters = new HashMap<>();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object message = new byte[]{};

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(Protocol.GALILEO);
        try {
            decoder.decode(channel, remoteAddress, message);
            fail("Expected an exception");
        } catch (Exception e) {
        }
    }

}