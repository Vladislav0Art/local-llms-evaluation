package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.junit.Test;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        SocketAddress address = mock(SocketAddress.class);
        ByteBuf buf = Unpooled.copiedBuffer("[CS*0000000000*0002*LK,89679,18]", StandardCharsets.US_ASCII);
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(address);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        decoder.setSessionManager(new TestSessionManager());

        Position position = (Position) decoder.decode(channel, address, buf);
        assertNotNull(position);
        assertEquals(18, position.getInteger(Position.KEY_BATTERY_LEVEL).intValue());
        assertEquals(89679, position.getInteger(Position.KEY_STEPS).intValue());
    }

}