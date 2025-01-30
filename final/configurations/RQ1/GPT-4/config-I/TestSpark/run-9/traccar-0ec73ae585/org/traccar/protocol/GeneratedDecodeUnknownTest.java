package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocol;
import org.traccar.NetworkSessionManager;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedDecodeUnknownTest {

    @Test
    public void decodeUnknownTest() throws Exception {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.wrappedBuffer("UNKNOWN".getBytes(StandardCharsets.US_ASCII));

        assertNull(decoder.decode(channel, remoteAddress, buf));
    }

}