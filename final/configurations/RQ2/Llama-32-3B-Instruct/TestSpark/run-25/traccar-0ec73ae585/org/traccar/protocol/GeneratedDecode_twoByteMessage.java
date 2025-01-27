package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecode_twoByteMessage {

    @Test
    public void decode_twoByteMessage() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf data = Unpooled.buffer(2);
        data.writeBytes(new byte[]{0x01, 0x02});
        Object msg = data;
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

}