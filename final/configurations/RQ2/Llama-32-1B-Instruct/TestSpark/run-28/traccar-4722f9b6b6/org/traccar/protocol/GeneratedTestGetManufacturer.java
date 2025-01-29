package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    private WatchProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new WatchProtocolDecoder(new Protocol());
    }

    @Test
    public void testGetManufacturer() throws Exception {
        String expected = "TRACCAR";
        String actual = decoder.getManufacturer();
        assertEquals(expected, actual);
    }

}