package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private WatchProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new WatchProtocolDecoder(mock(Protocol.class));
    }

    @Test
    public void testGetHasIndex() {
        assertEquals(true, decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("testManufacturer", decoder.getManufacturer());
    }

    @Test
    public void testDecode() {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);
        when(msg.toString()).thenReturn("test");

        assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}