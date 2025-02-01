package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionsTest {

    private static final String DEVICE_IDENTIFICATION = "123456789012345";

    @Test
    public void decodePositionsTest() throws Exception {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x03);
        buf.writeCharSequence(DEVICE_IDENTIFICATION, StandardCharsets.US_ASCII);
        buf.writeByte(0x30);
        buf.writeByte(0x00);
        buf.writeIntLE(2000000);
        buf.writeIntLE(2000000);
        buf.writeByte(0x20);
        buf.writeIntLE(1546300800);

        Channel channel = mock(Channel.class);
        SocketAddress address = mock(SocketAddress.class);

        List<Position> actualPositionList = decoder.decodePositions(channel, address, buf);

        assertNotNull(actualPositionList);
        assertEquals(1, actualPositionList.size());
        assertEquals(DEVICE_IDENTIFICATION, actualPositionList.get(0).getDeviceId());
        assertEquals(20.0, actualPositionList.get(0).getLatitude(), 0.01);
        assertEquals(20.0, actualPositionList.get(0).getLongitude(), 0.01);
    }

}