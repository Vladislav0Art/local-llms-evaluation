package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    public boolean getHasIndex() {
        return false;
    }

    public String getManufacturer() {
        return null;
    }
}

public class GeneratedTest {

    @Test
    public void testGetManufacturer() throws Exception {
        assertEquals("Unknown", ((WatchProtocolDecoder) new WatchProtocolDecoder()).getManufacturer());
    }

}