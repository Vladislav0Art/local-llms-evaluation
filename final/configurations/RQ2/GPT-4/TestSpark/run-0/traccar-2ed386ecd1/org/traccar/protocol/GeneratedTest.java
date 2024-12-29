package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsHasLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{0x01, 0x02, 0x03, 0x04});

        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsNoLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{0x01, 0x02, 0x03, 0x04});

        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsExtendedHadSatellitesTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{0x01, 0x02, 0x03, 0x04});

        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{0x01, 0x02, 0x03, 0x04});

        Assert.assertNotNull(decoder.decode(channel, remoteAddress, buf));
    }

}