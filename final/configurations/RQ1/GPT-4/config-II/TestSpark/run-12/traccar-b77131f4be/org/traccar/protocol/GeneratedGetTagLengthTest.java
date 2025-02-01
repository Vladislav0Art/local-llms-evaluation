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

public class GeneratedGetTagLengthTest {

    private GalileoProtocolDecoder decoder;

    @Test
    public void getTagLengthTest() {
        decoder = new GalileoProtocolDecoder(new Protocol("galileo"));

        int expectedTagLength = 1;
        int resultTagLength = decoder.getTagLength(0b00000001);

        assertEquals(expectedTagLength, resultTagLength);
    }

}