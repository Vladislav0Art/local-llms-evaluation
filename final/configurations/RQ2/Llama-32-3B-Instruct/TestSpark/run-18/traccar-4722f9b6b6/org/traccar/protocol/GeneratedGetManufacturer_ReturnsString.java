package org.traccar.protocol;

public class GeneratedGetManufacturer_ReturnsString {

    @Test
    public void getManufacturer_ReturnsString() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WatchProtocols);
        String result = decoder.getManufacturer();
        Assert.isNotEmpty(result);
    }

}