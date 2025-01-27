package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetHasIndex_Watch_Scenario2 {

    @Test
    public void getHasIndex_Watch_Scenario2() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act and Assert
        assertFalse(decoder.getHasIndex());
    }
}

class WatchProtocolDecoder {

    boolean hasIndex = true;
    byte[] buffer = {0, 1, 2, 3};

    public boolean decode(ByteBuf buf) {
        if (hasIndex && buf.remaining() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getHasIndex() {
        return hasIndex;
    }

}