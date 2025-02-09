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

public class GeneratedDecodeGpsTest {

    @Test
    public void decodeGpsTest() {
        Position position = Mockito.mock(Position.class);
        ByteBuf buf = Unpooled.copiedBuffer("0504030201", StandardCharsets.UTF_8);

        Assert.assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
        Mockito.verify(position, Mockito.times(1)).set(Mockito.any(), Mockito.any());
    }

}