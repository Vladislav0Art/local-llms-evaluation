package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private Position position;

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertEquals(Gt06ProtocolDecoder.class, decoder.getClass());
    }

    @Test
    public void decodeGpsHasLengthTrueTest() {
        ByteBuf buf = Unpooled.copiedBuffer("127.0.0.1", StandardCharsets.UTF_8);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsHasLengthFalseTest() {
        ByteBuf buf = Unpooled.copiedBuffer("127.0.0.1", StandardCharsets.UTF_8);
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsMultiParamsHasSatellitesTrueTest() {
        ByteBuf buf = Unpooled.copiedBuffer("127.0.0.1", StandardCharsets.UTF_8);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsMultiParamsHasSatellitesFalseTest() {
        ByteBuf buf = Unpooled.copiedBuffer("127.0.0.1", StandardCharsets.UTF_8);
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, true, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeGpsMultiParamsHasSpeedFalseTest() {
        ByteBuf buf = Unpooled.copiedBuffer("127.0.0.1", StandardCharsets.UTF_8);
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void decodeTest() throws Exception {
        ByteBuf msg = Unpooled.copiedBuffer("127.0.0.1", StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = spy(new Gt06ProtocolDecoder(protocol));
        doReturn(position).when(decoder).decode(channel, null, msg);
        decoder.decode(channel, null, msg);
        verify(decoder).decode(channel, null, msg);
    }

}