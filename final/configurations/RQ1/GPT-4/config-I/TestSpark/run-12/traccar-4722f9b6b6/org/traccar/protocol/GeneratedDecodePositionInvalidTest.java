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

public class GeneratedDecodePositionInvalidTest {

    @Test
    public void decodePositionInvalidTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        DeviceSession deviceSession = mock(DeviceSession.class);

        String data = "invalidPositionData";
        Position position = decoder.decodePosition(deviceSession, data);

        Assert.assertNull(position);
    }

}