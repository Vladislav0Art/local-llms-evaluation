package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Date;

public class GeneratedDecodePositionWithMessageTest {

    @Test
    public void decodePositionWithMessageTest() {
        Object message = new Object();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Object result = Gt06ProtocolDecoder.decode(channel, remoteAddress, message);
        assertNotNull(result);
    }

}