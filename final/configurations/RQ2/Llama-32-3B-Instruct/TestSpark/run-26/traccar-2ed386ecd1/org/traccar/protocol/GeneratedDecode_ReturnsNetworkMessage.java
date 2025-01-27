package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.io.ByteArrayOutputStream;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecode_ReturnsNetworkMessage {

    @Test
    public void decode_ReturnsNetworkMessage() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new NetworkMessage();
        assertEquals(new NetworkMessage(), Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}