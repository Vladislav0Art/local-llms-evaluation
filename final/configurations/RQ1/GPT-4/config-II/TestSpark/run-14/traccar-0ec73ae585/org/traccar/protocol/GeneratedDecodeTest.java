package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTest {

    private String id = "idTest";
    private String content = "contentTest";

    private ByteBuf getByteBuf(String data) {
        return Unpooled.wrappedBuffer(data.getBytes(StandardCharsets.US_ASCII));
    }

    @Test
    public void decodeTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        ByteBuf byteBuf = getByteBuf("[CS*1*0016*LK]");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertNotNull(decoder.decode(channel, mock(SocketAddress.class), byteBuf));
    }

}