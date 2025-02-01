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

public class GeneratedDecodeIridiumPositionTest {

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new TestProtocol());

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeShortLE(0x32);
        buf.writeByte(0x01);
        buf.writeShortLE(0x0001);
        buf.writeByte(0x1c);
        buf.writeUnsignedIntLE(0x01);
        buf.writeBytes("123456789012345".getBytes());
        buf.writeByte(0x01);
        buf.writeZero(4);
        buf.writeUnsignedIntLE(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis() / 1000);
        buf.writeZero(23);
        buf.writeBytes(new byte[]{0x01, 0x01, 0x01});
        buf.writeZero(10);

        Position position = decoder.decodeIridiumPosition(null, null, buf);

        Assert.assertNotNull(position);
        Assert.assertEquals("123456789012345", position.getDeviceId());
    }

}