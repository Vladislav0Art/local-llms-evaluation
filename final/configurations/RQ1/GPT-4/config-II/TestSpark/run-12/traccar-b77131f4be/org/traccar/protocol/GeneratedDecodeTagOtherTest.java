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

public class GeneratedDecodeTagOtherTest {

    private GalileoProtocolDecoder decoder;

    @Test
    public void decodeTagOtherTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte((byte) 0x01);
        buf.writeByte((byte) 0x55);

        Position position = new Position();
        decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        decoder.decodeTagOther(position, buf, buf.getByte(0));

        assertEquals(position.getAttributes().get(Position.KEY_VERSION_HW), 85);
    }

}