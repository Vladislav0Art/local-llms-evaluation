package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetHasIndex_Watch_Scenario1 {

    @Test
    public void getHasIndex_Watch_Scenario1() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act and Assert
        assertTrue(decoder.getHasIndex());
    }

}