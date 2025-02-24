package org.traccar.protocol;

public class GeneratedTest {

    private WatchProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new WatchProtocolDecoder(new WatchProtocol());
    }

    @Test
    public void testGetHasIndex() {
        assertTrue(decoder.getHasIndex());
    }

}