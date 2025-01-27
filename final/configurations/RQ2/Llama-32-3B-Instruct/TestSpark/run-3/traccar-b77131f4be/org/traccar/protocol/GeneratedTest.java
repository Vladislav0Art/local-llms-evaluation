package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Test
    public void newGalileoProtocolDecoder() {
        assertSame(protocol, new GalileoProtocolDecoder(protocol));
    }

    @Test
    public void decode_GalileoProtocol_Decoder_ReturnsNetworkMessage() throws Exception {
        NetworkMessage expected = Mockito.mock(NetworkMessage.class);
        Mockito.when(protocol).thenReturn(expected);
        Object result = new GalileoProtocolDecoder(protocol).decode(channel, remoteAddress, msg);
        Mockito.verify(channel).close();
        Mockito.verify(msg).equals(expected);
    }

    @Test
    public void decode_InvalidMessage_ReturnsNull() throws Exception {
        ByteBuf invalidMsg = Unpooled.copiedBuffer(4);
        Object result = new GalileoProtocolDecoder(protocol).decode(channel, remoteAddress, invalidMsg);
        Mockito.verify(channel).close();
        Mockito.verify(msg).equals(null);
    }

    @Test
    public void decode_NoPosition_ReturnsNull() throws Exception {
        ByteBuf noPosMessage = Unpooled.copiedBuffer(4);
        NetworkMessage expected = new NetworkMessage("No Position", null, null, 0, true);
        Mockito.when(protocol).thenReturn(expected);
        Object result = new GalileoProtocolDecoder(protocol).decode(channel, remoteAddress, noPosMessage);
        Mockito.verify(channel).close();
        Mockito.verify(msg).equals(expected);
    }

    @Test
    public void decode_PositionIsEmpty_ReturnsNull() throws Exception {
        ByteBuf emptyMessage = Unpooled.copiedBuffer(4);
        NetworkMessage expected = new NetworkMessage("No Position", null, null, 0, true);
        Mockito.when(protocol).thenReturn(expected);
        Object result = new GalileoProtocolDecoder(protocol).decode(channel, remoteAddress, emptyMessage);
        Mockito.verify(channel).close();
        Mockito.verify(msg).equals(expected);
    }

    @Test
    public void decode_PositionIsNotEmpty_ReturnsPosition() throws Exception {
        int lat = 1234567;
        int lon = 8901234;
        Random random = new Random();
        long timestamp = random.nextLong();
        long altitude = random.nextLong();
        Position pos = new Position(lat, lon, UnitsConverter.LATITUDE);
        ByteBuf message = Unpooled.copiedBuffer(16)
                .writeFloat(pos.getLatitude())
                .writeLong(pos.getAltitude())
                .retain(0);
        NetworkMessage expected = new NetworkMessage("No Position", pos, null, 0, true);
        Mockito.when(protocol).thenReturn(expected);
        Object result = new GalileoProtocolDecoder(protocol).decode(channel, remoteAddress, message);
        Mockito.verify(channel).close();
        Mockito.verify(msg).equals(expected);
    }

}