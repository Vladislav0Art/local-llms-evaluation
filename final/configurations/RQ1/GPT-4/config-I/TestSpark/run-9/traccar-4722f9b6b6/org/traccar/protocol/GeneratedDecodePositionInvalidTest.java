package org.traccar.protocol;

import org.junit.Test;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.session.Session;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePositionInvalidTest {

    @Test
    public void decodePositionInvalidTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Session deviceSession = mock(Session.class);
        when(deviceSession.getDeviceId()).thenReturn(1L);
        String data = "invalid data";
        Position position = decoder.decodePosition(deviceSession, data);
        assertEquals(position, null);
    }

}