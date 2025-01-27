package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecode_singleByteMessage {

    @Test
    public void decode_singleByteMessage() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf data = Unpooled.buffer(1);
        data.writeByte((byte) 0x01);
        Object msg = data;
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

}