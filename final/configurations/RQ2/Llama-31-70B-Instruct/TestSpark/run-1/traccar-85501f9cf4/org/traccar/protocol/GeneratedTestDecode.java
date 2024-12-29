package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Object();
        assertTrue(gt06ProtocolDecoder.decode(channel, remoteAddress, msg) != null);
    }

}