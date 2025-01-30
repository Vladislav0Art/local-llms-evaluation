package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.ProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Context;
import org.traccar.NetworkMessage;
import org.traccar.helper.Log;
import org.traccar.model.Device;
import org.traccar.model.DeviceSession;
import org.traccar.CommonProtocolDecoderTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;

public class GeneratedDecodeMinimalDataSetTest {

    public GalileoProtocolDecoderTest() {
        super(new GalileoProtocol());
    }

    @Test
    public void decodeMinimalDataSetTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeByte(0x01);
        buf.writeInt(86400);
        buf.writeByte(0x00);
        buf.writeInt(0x000FFFFF);  // approximately 1
        buf.writeInt(0x00200000);  // approximately 0
        buf.writeByte(0x01);

        Position position = new Position("TEST");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());

        decoder.decodeMinimalDataSet(position, buf.slice());

        assertNotNull(position.getFixTime());
        assertEquals(true, position.getValid());
        assertEquals(1.0, position.getLongitude(), 0.1);
        assertEquals(0.0, position.getLatitude(), 0.1);
        assertEquals(Position.ALARM_GENERAL, position.getAlarm());
    }

}