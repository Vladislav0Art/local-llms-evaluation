package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.util.List;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodeIridiumPositionTest {

    private GalileoProtocolDecoder decoder;

    @Test
    public void decodeIridiumPositionTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(new byte[]{0x01, 0x00, 0x00, (byte) 0x01, (byte) 0x01, (byte) 0xc0});

        SocketAddress remoteAddress = null;
        Channel channel = null;

        decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        Position result = decoder.decodeIridiumPosition(channel, remoteAddress, buf);

        assertNull(result);
    }

}