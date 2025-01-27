package org.traccar.protocol;

public class GeneratedGetManufacturer_ReturnsEmptyString {

    @Test
    public void getManufacturer_ReturnsEmptyString() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act and Assert
        String result = decoder.getManufacturer();
        Assertions.assertEquals("", result);
    }

}