package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsScenario1Test() {
        ByteBuf buf = Unpooled.copiedBuffer("Hello".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsScenario2Test() {
        ByteBuf buf = Unpooled.copiedBuffer("Hello".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsWithParametersTest() {
        ByteBuf buf = Unpooled.copiedBuffer("Hello".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(
                position, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeExceptionScenarioTest() throws Exception {
        byte[] messageBytes = "Hello".getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.copiedBuffer(messageBytes);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        decoder.decode(null, remoteAddress, buf);
    }

}