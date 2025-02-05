package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeCompleteGpsDataTest {

    @Mock
    private Protocol protocol;

    @Captor
    private ArgumentCaptor<Position> positionCaptor;

    @Test
    public void decodeCompleteGpsDataTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer("CompleteGpsData", StandardCharsets.UTF_8);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf,
                true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

}