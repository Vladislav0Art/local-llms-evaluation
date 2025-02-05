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
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Captor
    private ArgumentCaptor<Position> positionCaptor;

    @Test
    public void decodeGpsWithLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer("PositionDataWithLength", StandardCharsets.UTF_8);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeGpsWithoutLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer("PositionDataWithoutLength", StandardCharsets.UTF_8);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeCompleteGpsDataTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer("CompleteGpsData", StandardCharsets.UTF_8);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf,
                true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeIncompleteGpsDataTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer("IncompleteGpsData", StandardCharsets.UTF_8);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf,
                false, false, false, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeWithChannelMsgTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        String msg = "MessageToDecode";
        Object result = decoder.decode(null, remoteAddress, msg);
        assertNotNull(result);
    }

}