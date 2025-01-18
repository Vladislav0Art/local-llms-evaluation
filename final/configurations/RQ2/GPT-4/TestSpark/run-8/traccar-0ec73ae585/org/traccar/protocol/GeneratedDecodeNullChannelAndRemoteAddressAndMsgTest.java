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
public class GeneratedDecodeNullChannelAndRemoteAddressAndMsgTest {

    private final Protocol PROTOCOL = mock(Protocol.class);

    @Test
    public void decodeNullChannelAndRemoteAddressAndMsgTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(PROTOCOL);
        assertNull(decoder.decode(null, null, null));
    }

}