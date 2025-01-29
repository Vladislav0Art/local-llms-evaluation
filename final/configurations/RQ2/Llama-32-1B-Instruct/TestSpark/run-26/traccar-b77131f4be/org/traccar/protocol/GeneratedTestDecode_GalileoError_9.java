package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoError_9 {

    @Test
    public void testDecode_GalileoError_9() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

}