package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class GeneratedDecodeTagDoubleByteTest {

    @Test
    public void decodeTagDoubleByteTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new TestProtocol());
        int tag = 0x60;
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(0x02);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x02, position.getInt("fuel0"));

        buf.clear();
        tag = 0xb1;
        buf.writeShortLE(502);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(502, position.getInt("can16BitR6"));

        buf.clear();
        tag = 0xd6;
        buf.writeShortLE(0x08);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x08, position.getInt("can16BitR0"));
    }

}