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
    public void decodeGpsTest() {
        ByteBuf buf = Unpooled.copiedBuffer("00".getBytes(StandardCharsets.UTF_8));
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position();

        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, timezone));
    }

    @Test
    public void decodeGpsWithLengthTest() {
        ByteBuf buf = Unpooled.copiedBuffer("12".getBytes(StandardCharsets.UTF_8));
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position();

        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, timezone));
    }

    @Test
    public void decodeGpsWithSatAndSpeedTest() {
        ByteBuf buf = Unpooled.copiedBuffer("1234".getBytes(StandardCharsets.UTF_8));
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position();

        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, timezone));
    }

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = new Protocol();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(protocol);

        ByteBuf msg = Unpooled.copiedBuffer("1234567890".getBytes(StandardCharsets.UTF_8));
        Assert.assertNull(gt06ProtocolDecoder.decode(channel, remoteAddress, msg));

        ByteBuf msgEmpty = Unpooled.copiedBuffer("".getBytes(StandardCharsets.UTF_8));
        Assert.assertNull(gt06ProtocolDecoder.decode(channel, remoteAddress, msgEmpty));
    }

}