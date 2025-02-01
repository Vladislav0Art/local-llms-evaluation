package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedSendResponseTest {

    private Protocol protocol = new Protocol();
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void sendResponseTest() {
        Channel channelMock = mock(Channel.class);
        String id = "123";
        String index = "4567";
        String content = "INIT,1";
        decoder.sendResponse(channelMock, id, index, content);

        ByteBuf expectedResponse = Unpooled.copiedBuffer(
                String.format("[%s*%s*%s*%04x*%s]", "XY", id, index, content.length(), content), StandardCharsets.US_ASCII);
        verify(channelMock, times(1)).writeAndFlush(expectedResponse);
    }

}