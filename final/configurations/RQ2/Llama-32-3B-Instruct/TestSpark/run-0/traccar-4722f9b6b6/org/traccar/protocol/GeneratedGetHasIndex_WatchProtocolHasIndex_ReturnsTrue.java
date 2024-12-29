package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedGetHasIndex_WatchProtocolHasIndex_ReturnsTrue {

    @Test
    public void getHasIndex_WatchProtocolHasIndex_ReturnsTrue() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act and Assert
        assertTrue(decoder.getHasIndex());
    }

}