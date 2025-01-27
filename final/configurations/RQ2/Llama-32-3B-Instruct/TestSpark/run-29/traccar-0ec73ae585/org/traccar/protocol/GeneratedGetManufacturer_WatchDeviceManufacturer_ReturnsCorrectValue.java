package org.traccar.protocol;

public class GeneratedGetManufacturer_WatchDeviceManufacturer_ReturnsCorrectValue {

    @Test
    public void getManufacturer_WatchDeviceManufacturer_ReturnsCorrectValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_DEVICE);
        assertEquals("Watch Device", decoder.getManufacturer());
    }

}