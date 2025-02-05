package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsWithLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buffer = Unpooled.buffer();
        Position position = new Position();

        buffer.writeInt(3243243);
        buffer.writeInt(4342422);

        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buffer, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsWithoutLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buffer = Unpooled.buffer();
        Position position = new Position();

        buffer.writeInt(823492);
        buffer.writeInt(3928492);

        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buffer, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsWithSatellitesAndSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buffer = Unpooled.buffer();
        Position position = new Position();

        buffer.writeInt(3287923);
        buffer.writeInt(2384328);

        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buffer, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsWithoutSatellitesAndSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buffer = Unpooled.buffer();
        Position position = new Position();

        buffer.writeInt(2573825);
        buffer.writeInt(9585925);

        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buffer, false, false, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buffer = Unpooled.buffer();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = new InetSocketAddress("localhost", 8080);

        buffer.writeInt(1);
        buffer.writeInt(30);

        Assert.assertNull(decoder.decode(channel, address, buffer));
    }

}