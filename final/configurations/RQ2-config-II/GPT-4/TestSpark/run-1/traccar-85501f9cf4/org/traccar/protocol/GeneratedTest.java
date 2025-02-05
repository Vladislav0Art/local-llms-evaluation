package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void decodeGpsWithLengthTest() {
        Position position = new Position();
        position.setTimeZone(TimeZone.getTimeZone("GMT"));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer("20823189031206053911869250001900420000910060105000601".getBytes(StandardCharsets.UTF_8)), true, position.getTimeZone());
        assertTrue(result);
    }

    @Test
    public void decodeGpsWithoutLengthTest() {
        Position position = new Position();
        position.setTimeZone(TimeZone.getTimeZone("GMT"));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer("20823189031206053911869250001900420000910060105000601".getBytes(StandardCharsets.UTF_8)), false, position.getTimeZone());
        assertFalse(result);
    }

    @Test
    public void decodeGpsWithAllParametersTest() {
        genDecoderStub();
        Position position = new Position();
        position.setTimeZone(TimeZone.getTimeZone("GMT"));
        position.setProtocol(protocol);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer("20823189031206053911869250001900420000910060105000601".getBytes(StandardCharsets.UTF_8)), true, true, true, position.getTimeZone());
        assertTrue(result);
    }

    @Test
    public void decodeTest() throws Exception {
        genDecoderStub();
        Object msg = Unpooled.copiedBuffer("20823189031206053911869250001900420000910060105000601".getBytes(StandardCharsets.UTF_8));
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        decoder.decode(channel, null, msg);
    }

    private void genDecoderStub() {
        when(protocol.getString()).thenReturn("gt06");
    }

}