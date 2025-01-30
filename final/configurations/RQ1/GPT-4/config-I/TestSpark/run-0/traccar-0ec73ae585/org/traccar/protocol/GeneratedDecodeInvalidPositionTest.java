package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeInvalidPositionTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Position position;

    @Test
    public void decodeInvalidPositionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test") {
        });

        Method decodePositionMethod = WatchProtocolDecoder.class.getDeclaredMethod("decodePosition", DeviceSession.class, String.class);
        decodePositionMethod.setAccessible(true);

        position = (Position) decodePositionMethod.invoke(decoder, deviceSession, "051194,150000,1234.5678,N,0123.4567,E,1.23,45.6,78.9,3,2,7,45,5,00000000,,1,2,12");
        assertNull(position);
    }

}