package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetManufacturer_[Scenario5]

Test {

    @Test
    public void getManufacturer_[ Scenario5]Test() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        String manufacturer = (String) decoder.getManufacturer();

        // Assert
        assertEquals(" manufacturer ", manufacturer);
    }

}