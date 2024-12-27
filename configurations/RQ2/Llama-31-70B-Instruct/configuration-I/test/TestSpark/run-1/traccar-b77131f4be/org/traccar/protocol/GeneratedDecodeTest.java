package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        GalileoProtocolDecoder galileoProtocolDecoder = new GalileoProtocolDecoder(Mockito.mock(Protocol.class));
        Object expected = new Object();
        Object actual = galileoProtocolDecoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), expected);
        assertEquals(expected, actual);
    }

}