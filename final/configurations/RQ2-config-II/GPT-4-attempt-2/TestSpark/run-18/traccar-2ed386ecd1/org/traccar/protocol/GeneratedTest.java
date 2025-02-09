package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsSuccesfulCaseTest() {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(12);
        buffer.writeByte(34);

        Position mockPosition = Mockito.mock(Position.class);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        boolean response = Gt06ProtocolDecoder.decodeGps(mockPosition, buffer, true, timeZone);

        Assert.assertTrue(response);
    }

    @Test
    public void decodeGpsInvalidInputTest() {
        Position mockPosition = Mockito.mock(Position.class);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        boolean response = Gt06ProtocolDecoder.decodeGps(mockPosition, null, true, timeZone);

        Assert.assertFalse(response);
    }

    @Test
    public void decodeGpsExtendedSuccesfulCaseTest() {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(12);
        buffer.writeByte(34);

        Position mockPosition = Mockito.mock(Position.class);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        boolean response = Gt06ProtocolDecoder.decodeGps(mockPosition, buffer, true, true, true, timeZone);

        Assert.assertTrue(response);
    }

    @Test
    public void decodeGpsExtendedInvalidInputTest() {
        Position mockPosition = Mockito.mock(Position.class);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        boolean response = Gt06ProtocolDecoder.decodeGps(mockPosition, null, false, false, false, timeZone);

        Assert.assertFalse(response);
    }

    @Test
    public void decodeSuccessfulCaseTest() throws Exception {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(12);
        buffer.writeByte(34);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Assert.assertNotNull(decoder.decode(null, null, buffer));
    }

    @Test
    public void decodeExceptionCaseTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        decoder.decode(null, null, null);
    }

}