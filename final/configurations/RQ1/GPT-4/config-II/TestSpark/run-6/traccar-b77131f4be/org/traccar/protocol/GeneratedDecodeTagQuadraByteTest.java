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

public class GeneratedDecodeTagQuadraByteTest {

    @Test
    public void decodeTagQuadraByteTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new TestProtocol());
        int tag = 0xdb;
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeIntLE(0x02020202);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x02020202, position.getInt("can32BitR0"));

        buf.clear();
        tag = 0xe5;
        buf.writeIntLE(0x50505050);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x50505050, position.getInt("userData5"));

        buf.clear();
        tag = 0xf8;
        buf.writeIntLE(0x10101010);
        decoder.decodeTag(position, buf, tag);
        Assert.assertEquals(0x10101010, position.getInt("can32BitR13"));
    }

}