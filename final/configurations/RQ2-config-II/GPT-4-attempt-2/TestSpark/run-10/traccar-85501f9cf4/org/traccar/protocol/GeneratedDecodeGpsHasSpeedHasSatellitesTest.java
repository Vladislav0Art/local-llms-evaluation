package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsHasSpeedHasSatellitesTest {

    @Test
    public void decodeGpsHasSpeedHasSatellitesTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(Gt06ProtocolDecoder.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("testSpeedSatellites", StandardCharsets.US_ASCII);
        assertTrue(decoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

}