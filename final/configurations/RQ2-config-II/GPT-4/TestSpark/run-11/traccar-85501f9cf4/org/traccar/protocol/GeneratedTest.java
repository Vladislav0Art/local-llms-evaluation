package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    org.traccar.Protocol protocol;

    @Test
    public void Gt06ProtocolDecoderCreationTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void decodeGpsTest1() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("Hello", StandardCharsets.UTF_8);
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsTest2() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsTest3() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("Hello", StandardCharsets.UTF_8);
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsTest4() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeExceptionTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        decoder.decode(null, null, null);
    }

    @Test
    public void decodeNonActionTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("Hello", StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Object result = decoder.decode(null, null, buf);
        Assert.assertNull(result);
    }

}