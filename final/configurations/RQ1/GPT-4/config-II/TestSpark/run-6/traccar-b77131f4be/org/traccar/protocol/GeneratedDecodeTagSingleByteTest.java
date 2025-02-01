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

public class GeneratedDecodeTagSingleByteTest {

    @Test
    public void decodeTagSingleByteTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new TestProtocol());
        int tag = 0x01;
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x02);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x02, position.getInt(Position.PREFIX_ADC + (tag - 0x50)));

        buf.clear();
        tag = 0x62;
        buf.writeShortLE(502);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(502, position.getInt("fuel2"));

        buf.clear();
        tag = 0xa0;
        buf.writeByte(0x08);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x08, position.getInt("can8BitR15"));

        buf.clear();
        tag = 0xc4;
        buf.writeByte(0x16);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x16, position.getInt("can8BitR0"));

        buf.clear();
        tag = 0xf9;
        buf.writeIntLE(0x100);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x100, position.getInt("can32BitR14"));
    }

}