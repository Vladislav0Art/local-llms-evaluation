package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        Protocol protocol = new Protocol("WatchProtocolTest");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        String id = "100";
        String index = "1";
        String content = "SampleData";
        Mockito.when(channel.writeAndFlush(Mockito.any())).thenReturn(null);
        decoder.sendResponse(channel, id, index, content);
        assertNotNull(decoder.getManufacturer());
    }

}