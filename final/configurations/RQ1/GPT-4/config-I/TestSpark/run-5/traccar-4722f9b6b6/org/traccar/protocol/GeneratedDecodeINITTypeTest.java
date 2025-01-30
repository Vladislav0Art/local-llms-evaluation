package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;
import java.net.InetSocketAddress;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedDecodeINITTypeTest {

    @Test
    public void decodeINITTypeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = mock(Channel.class);

        ByteBuf buf = Unpooled.copiedBuffer("[3G*1234567*0007*INIT]", StandardCharsets.US_ASCII);
        decoder.decode(channel, new InetSocketAddress(1024), buf);

        verify(channel, times(1)).writeAndFlush(new NetworkMessage(any(), any()));
    }

}