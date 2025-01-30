package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        GalileoProtocolDecoder protocolDecoder = new GalileoProtocolDecoder(new Protocol("galileo"));

        Channel channel = mock(Channel.class);
        when(channel.writeAndFlush(Mockito.any())).thenReturn(null);

        protocolDecoder.sendResponse(channel, 1, 1);
        Mockito.verify(channel).writeAndFlush(Mockito.any());
    }

}