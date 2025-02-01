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

public class GeneratedDecodeTagOtherTest {

    @Test
    public void decodeTagOtherTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new TestProtocol());
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();

        int tag = 0x01;
        buf.writeByte(0x01);
        decoder.decodeTagOther(position, buf, tag);
        Assert.assertEquals(0x01, position.getInt(Position.KEY_VERSION_HW));

        buf.clear();
        tag = 0x02;
        buf.writeByte(0x02);
        decoder.decodeTagOther(position, buf, tag);
        Assert.assertEquals(0x02, position.getInt(Position.KEY_VERSION_FW));

        buf.clear();
        tag = 0x04;
        buf.writeShortLE(2000);
        decoder.decodeTagOther(position, buf, tag);
        Assert.assertEquals(2000, position.getInt("deviceId"));

        buf.clear();
        tag = 0x10;
        buf.writeShortLE(0x20);
        decoder.decodeTagOther(position, buf, tag);
        Assert.assertEquals(0x20, position.getInt(Position.KEY_INDEX));

        buf.clear();
        tag = 0x41;
        buf.writeShortLE((short) (3.7 * 1000));
        decoder.decodeTagOther(position, buf, tag);
        Assert.assertEquals(3.7, position.getDouble(Position.KEY_POWER), 0.01);

        buf.clear();
        tag = 0x90;
        buf.writeUnsignedIntLE(12345);
        decoder.decodeTagOther(position, buf, tag);
        Assert.assertEquals("12345", position.getString(Position.KEY_DRIVER_UNIQUE_ID));

        int skippedBytes = buf.readableBytes();
        buf.clear();
        tag = 0x999;  // Nonexistent case
        buf.writeZero(4);
        decoder.decodeTagOther(position, buf, tag);
        Assert.assertEquals(skippedBytes, buf.readableBytes());
    }

}