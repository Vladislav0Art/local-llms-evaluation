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
public class GeneratedDecodeIridiumPositionTest {

    private static final String DEVICE_IDENTIFICATION = "123456789012345";

    @Test
    public void decodeIridiumPositionTest() {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(10);
        buf.writeMediumLE(0x01001c);

        buf.writeIntLE(1234); // index
        buf.writeCharSequence(DEVICE_IDENTIFICATION, StandardCharsets.US_ASCII);

        buf.writeByte(1); // session status
        buf.writeInt(0); // reserved
        buf.writeIntLE(1546300800); // date and time

        buf.writeBytes(new byte[23]); // coordinates block

        buf.writeMediumLE(2); // data tag header
        buf.writeMediumLE(3); // minimal data set

        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Position position = decoder.decodeIridiumPosition(channel, remoteAddress, buf);

        assertEquals(DEVICE_IDENTIFICATION, position.getDeviceId());
    }

}