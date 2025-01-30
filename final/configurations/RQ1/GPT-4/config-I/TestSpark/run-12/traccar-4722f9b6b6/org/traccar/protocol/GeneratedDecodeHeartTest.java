package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeHeartTest {

    @Test
    public void decodeHeartTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);

        String msg = "[3G*1234567890*000E*HEART,75]";
        Object decoded = decoder.decode(channel, null, Unpooled.copiedBuffer(msg, StandardCharsets.US_ASCII));

        Assert.assertTrue(decoded instanceof Position);
        Position position = (Position) decoded;

        Assert.assertEquals(position.getProtocol(), protocol.getName());
        Assert.assertEquals(position.get(Position.KEY_HEART_RATE), 75);
    }

}