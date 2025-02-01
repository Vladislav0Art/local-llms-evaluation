package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        final Channel channel = Mockito.mock(Channel.class);
        String id = "testId";
        String index = "1";
        String content = "content";

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        decoder.sendResponse(channel, id, index, content);

        byte[] expectedResponse = new byte[]{1, 2, 3, 4, 5}; // Your expected response data as byte array
        ByteBuf expectedBuf = Unpooled.wrappedBuffer(expectedResponse);
        verify(channel).writeAndFlush(expectedBuf);
    }

}