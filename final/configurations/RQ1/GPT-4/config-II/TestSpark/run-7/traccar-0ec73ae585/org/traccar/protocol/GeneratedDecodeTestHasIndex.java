package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import io.netty.channel.Channel;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTestHasIndex {

    @Test
    public void decodeTestHasIndex() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("[3G*3305889904*000A*LK,15,100]", StandardCharsets.US_ASCII);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        Position position = (Position) decoder.decode(channel, remoteAddress, buf);

        assertTrue(decoder.getHasIndex());
    }

}