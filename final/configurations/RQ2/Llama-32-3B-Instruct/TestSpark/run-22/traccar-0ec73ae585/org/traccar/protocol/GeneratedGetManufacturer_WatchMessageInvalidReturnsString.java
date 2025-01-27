package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedGetManufacturer_WatchMessageInvalidReturnsString {

    @Test
    public void getManufacturer_WatchMessageInvalidReturnsString() throws Exception {
        // Given:
        byte[] bytes = new byte[]{ /* Invalid message */};
        Network network = new Network();
        DeviceSession session = new DeviceSession();

        // When & Then:
        assertEquals("", WatchProtocolDecoder.getManufacturer());
    }

}

class WatchMessage implements Protocol, NetworkMessage {
    private boolean hasIndex;
    private String manufacturer;

    public boolean getHasIndex() {
        return hasIndex;
    }

    public void setHasIndex(boolean index) {
        this.hasIndex = index;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}