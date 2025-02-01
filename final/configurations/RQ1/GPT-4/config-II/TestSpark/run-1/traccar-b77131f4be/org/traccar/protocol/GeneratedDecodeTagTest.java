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
public class GeneratedDecodeTagTest {

    private static final String DEVICE_IDENTIFICATION = "123456789012345";

    @Test
    public void decodeTagTest() {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Position actualPosition = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x0f);

        decoder.decodeTag(actualPosition, buf, 0x01);
        assertEquals(15, (int) actualPosition.getAttributes().get(Position.KEY_VERSION_HW));
    }

}