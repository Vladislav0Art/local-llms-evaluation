package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsHasLengthAndTimezoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        byte[] bytes = {0x00, 0x00, 0x00};
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsHasNoLengthAndNoTimezoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        byte[] bytes = {0x00, 0x00, 0x00};
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, null));
    }

    @Test
    public void decodeGpsHasLengthAndHasSatelliteHasSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        byte[] bytes = {0x00, 0x00, 0x00};
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsHasNoLengthHasNoSatelliteHasNoSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        byte[] bytes = {0x00, 0x00, 0x00};
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, null));
    }

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        byte[] bytes = {0x00, 0x00, 0x00};
        ByteBuf msg = Unpooled.wrappedBuffer(bytes);
        Assert.assertNull(decoder.decode(null, new InetSocketAddress("127.0.0.1", 80), msg));
    }

}