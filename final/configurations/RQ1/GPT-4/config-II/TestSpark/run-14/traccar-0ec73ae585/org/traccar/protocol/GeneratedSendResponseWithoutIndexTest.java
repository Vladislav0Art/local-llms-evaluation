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

public class GeneratedSendResponseWithoutIndexTest {

    private String id = "idTest";
    private String content = "contentTest";

    private ByteBuf getByteBuf(String data) {
        return Unpooled.wrappedBuffer(data.getBytes(StandardCharsets.US_ASCII));
    }

    @Test
    public void sendResponseWithoutIndexTest() {
        Channel channel = Mockito.mock(Channel.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        decoder.sendResponse(channel, id, null, content);
        Mockito.verify(channel, Mockito.times(1)).writeAndFlush(Mockito.any());
    }

}