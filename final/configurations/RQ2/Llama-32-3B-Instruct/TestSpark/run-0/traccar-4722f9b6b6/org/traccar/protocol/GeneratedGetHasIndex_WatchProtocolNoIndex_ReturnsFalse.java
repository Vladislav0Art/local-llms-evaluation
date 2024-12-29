package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedGetHasIndex_WatchProtocolNoIndex_ReturnsFalse {

    @Test
    public void getHasIndex_WatchProtocolNoIndex_ReturnsFalse() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.NO_INDEX);

        // Act and Assert
        assertFalse(decoder.getHasIndex());
    }

}