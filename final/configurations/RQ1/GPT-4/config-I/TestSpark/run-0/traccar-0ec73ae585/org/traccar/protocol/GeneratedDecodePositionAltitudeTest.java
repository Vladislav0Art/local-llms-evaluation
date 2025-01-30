package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.session.Session;
import org.traccar.ProtocolDecoder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

import org.traccar.model.Position;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionAltitudeTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress socketAddress;

    @Test
    public void decodePositionAltitudeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Position position = decoder.decodePosition(null, "040920,063751,A,-3771.55234,S,-7084.36447,W,0.00,263.3,301.0,6,31,96,508,0,01000000Aa00,3,2,3");
        assertNotNull(position);
        assertEquals(-3771.55234, position.getLatitude(), 0.005);
        assertEquals(-7084.36447, position.getLongitude(), 0.005);
        assertEquals(301, position.getAltitude(), 0.5);
    }

}