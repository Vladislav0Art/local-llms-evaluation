package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.mockito.Mockito.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Protocol protocol = mock(Protocol.class);
        Object msg = "Some message";

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Object decoded = decoder.decode(channel, remoteAddress, msg);

        Assert.assertNotNull(decoded);
    }

}