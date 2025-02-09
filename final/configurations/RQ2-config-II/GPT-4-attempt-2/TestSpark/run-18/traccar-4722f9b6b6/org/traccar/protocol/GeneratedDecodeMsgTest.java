package org.traccar.protocol;

import org.junit.Test;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeMsgTest {

    @Test
    public void decodeMsgTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "msg";

        Object actual = decoder.decode(channel, remoteAddress,
                Unpooled.copiedBuffer(msg, StandardCharsets.US_ASCII));
        assertNotNull(actual);
    }

}