package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

public class GeneratedDecodeExceptionTest {

    @Test
    public void decodeExceptionTest() throws Exception {
        Protocol protocol = new Protocol("DecoderProbe".getBytes(StandardCharsets.UTF_8));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new Object();
        try {
            Object object = decoder.decode(channel, remoteAddress, msg);
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof Exception);
        }
    }

}