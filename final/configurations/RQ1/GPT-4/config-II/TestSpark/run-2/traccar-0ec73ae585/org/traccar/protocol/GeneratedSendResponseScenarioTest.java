package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;

public class GeneratedSendResponseScenarioTest {

    @Test
    public void sendResponseScenarioTest() {
        Channel mockedChannel = mock(Channel.class);
        when(mockedChannel.remoteAddress()).thenReturn(mock(SocketAddress.class));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        decoder.sendResponse(
                mockedChannel,
                "ID",
                "INDEX",
                "one=1,two=2");
        assertTrue(true);
    }

}