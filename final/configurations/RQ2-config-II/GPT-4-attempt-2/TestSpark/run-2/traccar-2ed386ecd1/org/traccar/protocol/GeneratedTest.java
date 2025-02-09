package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsHasLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000132116", StandardCharsets.US_ASCII);
        Assert.assertTrue(decoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsNoLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("00001321", StandardCharsets.US_ASCII);
        Assert.assertFalse(decoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsWithAdditionalParametersTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0000132116", StandardCharsets.US_ASCII);
        Assert.assertTrue(decoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeNullTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Assert.assertEquals(null, decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), null));
    }

    @Test
    public void decodeValidMessageTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        ByteBuf msg = Unpooled.copiedBuffer("12BB010869862070183016BB01F600142B07AE02305D28C004019100F8012233070114020900000015091713852000C1", StandardCharsets.US_ASCII);
        Assert.assertNotNull(decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), msg));
    }

}