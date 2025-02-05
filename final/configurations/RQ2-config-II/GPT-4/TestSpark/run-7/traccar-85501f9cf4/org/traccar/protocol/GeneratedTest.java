package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Protocol protocol;

    @Test
    public void decodeGpsWithoutLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("12AB34", StandardCharsets.UTF_8);
        boolean result = decoder.decodeGps(position, buf, false, TimeZone.getDefault());
        assertFalse(result);
    }

    @Test
    public void decodeGpsWithLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("12AB345544", StandardCharsets.UTF_8);
        boolean result = decoder.decodeGps(position, buf, true, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeGpsExtendedWithoutSatellitesSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("12AB345544", StandardCharsets.UTF_8);
        boolean result = decoder.decodeGps(position, buf, true, false, false, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeWithGpsExtendedWithSatellitesSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("12AB345544", StandardCharsets.UTF_8);
        boolean result = decoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeWithInvalidMsgTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        decoder.decode(null, null, "InvalidMsg");
    }

    @Test
    public void decodeValidMsgTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer("Gt0612AB345544TEST", StandardCharsets.UTF_8);
        Object result = decoder.decode(null, null, buf);
        assertTrue(result instanceof Position);
    }

}