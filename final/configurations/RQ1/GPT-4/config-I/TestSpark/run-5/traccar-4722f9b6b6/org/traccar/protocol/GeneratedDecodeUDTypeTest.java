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

public class GeneratedDecodeUDTypeTest {

    @Test
    public void decodeUDTypeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = mock(Channel.class);

        ByteBuf buf = Unpooled.copiedBuffer("[3G*1234567*007D*UD,040909,175730,A,22.643032,N,114.019167,E,0.00,312.9,10,6,100,0,14139,550,898607B2141630430381,404,7EB2,1920,2147483647,2,CMnet]", StandardCharsets.US_ASCII);
        decoder.decode(channel, new InetSocketAddress(1024), buf);

        verify(channel, times(0)).writeAndFlush(new NetworkMessage(any(), any()));
    }

}