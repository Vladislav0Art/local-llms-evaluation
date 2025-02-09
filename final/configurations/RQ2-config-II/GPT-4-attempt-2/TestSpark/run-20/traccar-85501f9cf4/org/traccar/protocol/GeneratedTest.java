package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;

import org.traccar.model.Position;

import java.util.Date;

public class GeneratedTest {

    @Test
    public void decodeGpsHasLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.wrappedBuffer(new byte[]{0, 0, 0}), true, TimeZone.getDefault());
        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsNoLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.wrappedBuffer(new byte[]{0, 0, 0}), false, TimeZone.getDefault());
        Assert.assertFalse(result);
    }

    @Test
    public void decodeGpsHasSatellitesTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(
                position,
                Unpooled.wrappedBuffer(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}),
                true,
                true,
                true,
                TimeZone.getDefault()
        );
        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsNoSatellitesTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(
                position,
                Unpooled.wrappedBuffer(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}),
                true,
                false,
                true,
                TimeZone.getDefault()
        );
        Assert.assertFalse(result);
    }

    @Test
    public void decodeGpsWithChannelAndSocketAddress() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("Gt06Protocol Test".getBytes(StandardCharsets.UTF_8));
        buffer.flip();

        Assert.assertNull(decoder.decode(null, null, buffer.array()));
    }

}