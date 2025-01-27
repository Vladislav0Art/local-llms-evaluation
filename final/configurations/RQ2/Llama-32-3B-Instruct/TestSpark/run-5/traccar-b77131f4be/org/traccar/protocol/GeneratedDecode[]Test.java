package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDecode[]

Test {

    @Test
    public void decode[] Test() throws Exception {
        Map<String, Object> parameters = new HashMap<>();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object message = Mockito.mock(Object.class);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(Protocol.GALILEO);
        Object decodedMessage = decoder.decode(channel, remoteAddress, message);
        assertTrue(decodedMessage instanceof Map);
    }

}