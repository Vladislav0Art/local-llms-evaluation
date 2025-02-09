package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object object = new Object();

        Object result = decoder.decode(null, remoteAddress, object);
        Assert.assertNull(result);
    }

}