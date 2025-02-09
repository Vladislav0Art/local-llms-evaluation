package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedDecode_NullObjectTest {

    @Test
    public void decode_NullObjectTest() throws Exception {
        Protocol protocolMock = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);

        Object result = decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), null);

        assertEquals(null, result); // assuming null is returned when input is null
    }

}