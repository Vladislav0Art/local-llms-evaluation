package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetHasIndex_[Scenario4]

Test {

    @Test
    public void getHasIndex_[ Scenario4]Test() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        boolean hasIndex = (Boolean) decoder.getHasIndex();

        // Assert
        assertFalse(hasIndex);
    }

}