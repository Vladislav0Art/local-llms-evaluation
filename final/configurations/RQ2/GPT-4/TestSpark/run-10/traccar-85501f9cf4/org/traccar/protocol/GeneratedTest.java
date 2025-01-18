package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void Gt06ProtocolDecoderCreationTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        Assert.assertNotNull(decoder);
    }

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        byte[] data = "gpsdata".getBytes(StandardCharsets.UTF_8);
        ByteBuf buffer = Unpooled.copiedBuffer(data);

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buffer, false, TimeZone.getDefault());

        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsWithLengthTest() {
        Position position = new Position();
        byte[] data = "gpsdatalong".getBytes(StandardCharsets.UTF_8);
        ByteBuf buffer = Unpooled.copiedBuffer(data);

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buffer, true, TimeZone.getDefault());

        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsWithSpeedAndSatellitesTest() {
        Position position = new Position();
        byte[] data = "gpsdata".getBytes(StandardCharsets.UTF_8);
        ByteBuf buffer = Unpooled.copiedBuffer(data);

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buffer, true, true, true, TimeZone.getDefault());

        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsWithLengthAndWithoutSpeedAndSatellitesTest() {
        Position position = new Position();
        byte[] data = "gpsdata".getBytes(StandardCharsets.UTF_8);
        ByteBuf buffer = Unpooled.copiedBuffer(data);

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buffer, true, false, false, TimeZone.getDefault());

        Assert.assertTrue(result);
    }

    @Test
    public void decodeExceptionTest() throws Exception {
        Protocol protocolMock = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocolMock);

        decoder.decode(null, null, null);
    }

}