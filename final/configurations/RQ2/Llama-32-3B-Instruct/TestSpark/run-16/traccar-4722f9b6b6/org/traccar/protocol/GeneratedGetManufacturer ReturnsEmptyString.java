package org.traccar.protocol;

public class GeneratedGetManufacturer ReturnsEmptyString {

    @Test
    public void getManufacturer

    ReturnsEmptyString() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        String result = decoder.getManufacturer();

        // Act and Assert
        Assertions.assertEquals("", result);
    }

}