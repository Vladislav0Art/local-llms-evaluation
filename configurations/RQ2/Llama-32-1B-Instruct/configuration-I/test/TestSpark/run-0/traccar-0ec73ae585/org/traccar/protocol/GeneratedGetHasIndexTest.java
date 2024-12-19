package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        Protocol protocol = new Protocol();

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder.getHasIndex(channel, remoteAddress, msg));
    }

}