package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.mockito.Mockito.mock;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class GeneratedDecodeGpsWithoutLengthTest {

    private Channel channel = mock(Channel.class);

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        org.junit.Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer("GPS_DATA".getBytes(StandardCharsets.UTF_8)), false, TimeZone.getDefault()));
    }

}