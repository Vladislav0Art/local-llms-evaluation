package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.ProtocolDecoder;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsTest() {
        Position position = Mockito.mock(Position.class);
        ByteBuf buf = Unpooled.copiedBuffer("0504030201", StandardCharsets.UTF_8);

        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
        Mockito.verify(position, Mockito.times(1)).set(Mockito.any(), Mockito.any());
    }

    @Test
    public void decodeGpsDifferentParamsTest() {
        Position position = Mockito.mock(Position.class);
        ByteBuf buf = Unpooled.copiedBuffer("0504030201", StandardCharsets.UTF_8);

        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
        Mockito.verify(position, Mockito.times(1)).set(Mockito.any(), Mockito.any());
    }

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        Object msg = Mockito.mock(Object.class);

        Assert.assertNotNull(decoder.decode(null, null, msg));
        Mockito.verify(msg, Mockito.never()).toString();
    }

    @Test
    public void decodeWithExceptionTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        SocketAddress sockAddr = Mockito.mock(SocketAddress.class);
        Mockito.when(sockAddr.toString()).thenThrow(new Exception("Mock Exception"));

        decoder.decode(null, sockAddr, "Test message");
    }

}