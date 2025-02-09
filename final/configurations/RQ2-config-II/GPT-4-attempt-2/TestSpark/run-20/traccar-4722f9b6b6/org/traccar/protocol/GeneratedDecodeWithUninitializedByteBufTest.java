package org.traccar.protocol;

import io.netty.buffer.AdvancedLeakAwareByteBuf;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.InetSocketAddress;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedDecodeWithUninitializedByteBufTest {

    @Test
    public void decodeWithUninitializedByteBufTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 9091);
        Object msg = new AdvancedLeakAwareByteBuf(null, null, false);
        Object result = watchProtocolDecoder.decode(channel, remoteAddress, msg);
        assertTrue(result == null);
    }

}