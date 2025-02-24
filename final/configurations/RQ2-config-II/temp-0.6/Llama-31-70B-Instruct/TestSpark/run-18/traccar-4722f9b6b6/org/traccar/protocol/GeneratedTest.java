package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private WatchProtocolDecoder watchProtocolDecoder; // instance of the class under test

    @Before
    public void setUp() {
        Protocol protocol = Mockito.mock(Protocol.class);
        watchProtocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void testGetHasIndex() {
        assertEquals(false, watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("unknown", watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void testDecode() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        Object result = watchProtocolDecoder.decode(channel, remoteAddress, msg);

        assertNull(result);
    }

}