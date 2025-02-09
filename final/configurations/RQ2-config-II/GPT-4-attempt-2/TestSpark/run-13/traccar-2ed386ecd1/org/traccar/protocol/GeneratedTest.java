package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void Gt06ProtocolDecoderConstructionTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        assertNotNull(decoder);
    }

    @Test
    public void decodeGpsNoLengthNoTimeTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());
        assertFalse(result);
    }

    @Test
    public void decodeGpsNoLengthWithTimeTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(0);
        buf.writeByte((byte) 1);
        buf.writeByte((byte) 1);
        buf.writeByte((byte) 1);
        buf.writeByte((byte) 0);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getTimeZone("GMT"));
        assertTrue(result);
    }

    @Test
    public void decodeGpsWithLengthNoTimeTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte((byte) 0); // status
        buf.writeByte((byte) 0); // satellites
        buf.writeByte((byte) 0); // longitude
        buf.writeByte((byte) 0); // latitude
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault());
        assertFalse(result);
    }

    @Test
    public void decodeGpsWithLengthSatellitesSpeedTimeTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte((byte) 0); // status
        buf.writeByte((byte) 1); // satellites
        buf.writeByte((byte) 0); // longitude
        buf.writeByte((byte) 0); // latitude
        buf.writeByte((byte) 0); // speed
        buf.writeLong(0L); // time
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        assertFalse(result);
    }

    @Test
    public void decodeCallHomeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Channel channel = mock(Channel.class);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x79); // header
        buf.writeByte(0x79); // header
        buf.writeByte(0x01); // type
        buf.writeShort(0x0012); // length
        buf.writeByte(0x44); // checksum
        buf.writeByte(0x0D); // stop bit
        buf.writeByte(0x0A); // stop bit
        Object result = decoder.decode(channel, null, buf);
        assertNull(result);
    }

    @Test
    public void decodeCallGpsTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Channel channel = mock(Channel.class);
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        Object result = decoder.decode(channel, null, buf);
        assertNull(result);
    }

}