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

public class GeneratedDecodeWithNullArgsTest {

    @Test
    public void decodeWithNullArgsTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        watchProtocolDecoder.decode(null, null, null);
    }

}