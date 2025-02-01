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
public class GeneratedDecodeCompressedPositionsTest {

    private static final String DEVICE_IDENTIFICATION = "123456789012345";

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(2);
        buf.writeByte(0x34);
        buf.writeByte(0x20);
        Channel channel = mock(Channel.class);
        SocketAddress address = mock(SocketAddress.class);
        List<Position> actualPositionList = decoder.decodeCompressedPositions(channel, address, buf);
        assertEquals(1, actualPositionList.size());
    }

}