package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Before
    public void setUp() {
        watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());
    }

    @Test
    public void testGetHasIndex() {
        boolean result = watchProtocolDecoder.getHasIndex();

        // Verify assertions
        Assert.assertFalse(result);
    }

}