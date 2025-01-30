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

public class GeneratedDecodePositionValidTest {

    @Test
    public void decodePositionValidTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Session deviceSession = mock(Session.class);
        when(deviceSession.getDeviceId()).thenReturn(1L);
        String data = "060619010101A,45.6789,N,90.1234,E,1,2,3,4,5,6,7,8,1234,abc";
        Position position = decoder.decodePosition(deviceSession, data);
        assertNotNull(position);
        assertEquals(position.getDeviceId(), 1L);
    }

}