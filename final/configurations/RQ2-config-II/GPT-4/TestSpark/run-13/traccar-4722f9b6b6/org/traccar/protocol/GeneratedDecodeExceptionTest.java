package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

public class GeneratedDecodeExceptionTest {

    @Test
    public void decodeExceptionTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);
        Channel mockChannel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

        try {
            decoder.decode(mockChannel, remoteAddress, new Object());
            Assert.fail("Exception not thrown");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
        }
    }

}