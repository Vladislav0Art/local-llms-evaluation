package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedGetHasIndex_ReturnsFalse {

    @Test
    public void getHasIndex_ReturnsFalse() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        boolean result = decoder.getHasIndex();

        // Assert
        assertFalse(result);
    }
}

public class WatchMessageWithIndex extends NetworkMessage {

    private String index;

    public WatchMessageWithIndex(String index) {
        this.index = index;
    }

    @Override
    public Class<? extends Object> getRequiredClass() {
        return WatchProtocolDecoder.class;
    }

    public String getIndex() {
        return index;
    }
}

public class WatchMessageWithoutIndex extends NetworkMessage {

    private Date timestamp;

    public WatchMessageWithoutIndex(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public Class<? extends Object> getRequiredClass() {
        return WatchProtocolDecoder.class;
    }

    public Date getTimestamp() {
        return timestamp;
    }

}