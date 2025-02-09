package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void Gt06ProtocolDecoderInitializationTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertTrue(decoder instanceof Gt06ProtocolDecoder);
    }

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        String hex = "00240C1A0F091EF703CD68F8003C00000000000000000000000000000000020017090C1A0C4D75";
        ByteBuf buf = Unpooled.wrappedBuffer(hex.getBytes(StandardCharsets.UTF_8));

        Boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());

        assertTrue(result);
        assertEquals(position.getPosition(), )
    }

    @Test
    public void decodeGpsWithLengthTest() {
        Position position = new Position();
        String hex = "00240C1A0F091EF703CD68F8003C00000000000000000000000000000000020017090C1A0C4D75";
        ByteBuf buf = Unpooled.wrappedBuffer(hex.getBytes(StandardCharsets.UTF_8));

        Boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault());

        assertTrue(result);
    }

    @Test
    public void decodeGpsWithLengthSatellitesSpeedTest() {
        Position position = new Position();
        String hex = "00240C1A0F091EF703CD68F8003C00000000000000000000000000000000020017090C1A0C4D75";
        ByteBuf buf = Unpooled.wrappedBuffer(hex.getBytes(StandardCharsets.UTF_8));

        Boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());

        assertTrue(result);
    }

    @Test
    public void decodeGpsWithoutLengthSatellitesSpeedTest() {
        Position position = new Position();
        String hex = "00240C1A0F091EF703CD68F8003C00000000000000000000000000000000020017090C1A0C4D75";
        ByteBuf buf = Unpooled.wrappedBuffer(hex.getBytes(StandardCharsets.UTF_8));

        Boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, TimeZone.getDefault());

        assertTrue(result);
    }

    @Test
    public void decodeValidMessageTest() throws Exception {
        String message = "Hello";
        String remoteAddress = "192.168.1.5";
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals(result, message);
    }

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        // pass null as message
        decoder.decode(channel, Mockito.any(), null);
    }

}