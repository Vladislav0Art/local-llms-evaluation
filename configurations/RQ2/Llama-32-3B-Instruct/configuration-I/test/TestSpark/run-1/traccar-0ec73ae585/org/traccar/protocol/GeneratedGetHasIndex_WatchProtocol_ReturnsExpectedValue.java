package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetHasIndex_WatchProtocol_ReturnsExpectedValue {

    @Test
    public void getHasIndex_WatchProtocol_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder("WatchProtocol");
        assertTrue(decoder.getHasIndex());
    }

}