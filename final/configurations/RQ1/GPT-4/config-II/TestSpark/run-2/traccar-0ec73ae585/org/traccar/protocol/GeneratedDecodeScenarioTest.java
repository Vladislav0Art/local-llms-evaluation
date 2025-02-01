package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;

public class GeneratedDecodeScenarioTest {

    @Test
    public void decodeScenarioTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        ByteBuf buf = Unpooled.copiedBuffer("[*,ID,*TYPE,CONTENT]", StandardCharsets.US_ASCII);
        Channel mockedChannel = mock(Channel.class);
        when(mockedChannel.remoteAddress()).thenReturn(mock(SocketAddress.class));
        decoder.decode(mockedChannel, mock(SocketAddress.class), buf);
        assertTrue(decoder.getHasIndex());
    }

}