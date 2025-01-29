package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new WatchProtocolDecoder(new Protocol());
    }

    @Test
    public void testGetHasIndex() throws Exception {
        String expected = "1";
        boolean actual = decoder.getHasIndex();
        assertTrue(actual, expected.equals(actual));
    }

}