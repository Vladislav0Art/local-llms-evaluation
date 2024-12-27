package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

import java.nio.channels.Channel;
import java.net.SocketAddress;

import io.netty.channel.Channel;
import org.jboss.netty.channel.Channel;

import static org.mockito.Mockito.*;

public class GeneratedDecodeNonNullMsgTest {

    @Test
    public void decodeNonNullMsgTest() throws Exception {
        Protocol mockProtocol = mock(Protocol.class);
        Channel mockChannel = mock(Channel.class);
        SocketAddress mockAddress = mock(SocketAddress.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        String msg = "test message";
        Assert.assertEquals(msg, decoder.decode(mockChannel, mockAddress, msg));
    }

}