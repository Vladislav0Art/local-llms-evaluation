package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Channel mockedChannel = mock(Channel.class);
        SocketAddress mockedRemoteAddress = mock(SocketAddress.class);
        Protocol mockedProtocol = mock(Protocol.class);

        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(mockedProtocol);
        Object msg = "message";

        // We can't assert true or false because the method doesn't return a boolean
        // So, we assert that it's not null
        assertTrue(gt06ProtocolDecoder.decode(mockedChannel, mockedRemoteAddress, msg) != null);
    }

}