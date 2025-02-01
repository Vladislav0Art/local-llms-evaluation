package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeTagTest {

    @Test
    public void decodeTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position();
        decoder.decodeTag(position, buf, 0x01);
        assertTrue(position.getAttribute(Position.PREFIX_ADC + 0) instanceof Integer);
    }

}