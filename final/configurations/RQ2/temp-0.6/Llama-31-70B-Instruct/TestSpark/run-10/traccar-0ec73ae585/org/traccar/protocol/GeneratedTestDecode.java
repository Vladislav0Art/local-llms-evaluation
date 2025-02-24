package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestDecode {

    private final WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void testDecode() throws Exception {
        NetworkMessage networkMessage = Mockito.mock(NetworkMessage.class);
        when(networkMessage.getRemoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));
        Object msg = Mockito.mock(Object.class);

        Object decodedObject = watchProtocolDecoder.decode(Mockito.mock(Channel.class), networkMessage.getRemoteAddress(), msg);

        assertEquals(null, decodedObject);
    }

}