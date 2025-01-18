package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.nio.ByteBuffer;
import java.net.SocketAddress;
import java.util.TimeZone;

import static org.mockito.Mockito.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mock(Protocol.class));
        SocketAddress remoteAddress = mock(SocketAddress.class);

        Object result = decoder.decode(null, remoteAddress, Unpooled.wrappedBuffer(ByteBuffer.allocate(4).putInt(123).array()));

        Assert.assertNotNull(result);
    }

}