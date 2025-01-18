package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNonNullChannelAndRemoteAddressAndNullMsgTest {

    private final Protocol PROTOCOL = mock(Protocol.class);

    @Test
    public void decodeNonNullChannelAndRemoteAddressAndNullMsgTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(PROTOCOL);
        assertNull(decoder.decode(channel, remoteAddress, null));
    }

}