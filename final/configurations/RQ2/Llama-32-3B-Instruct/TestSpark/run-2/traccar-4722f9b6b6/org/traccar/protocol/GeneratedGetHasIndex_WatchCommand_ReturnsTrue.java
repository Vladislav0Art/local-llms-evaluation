package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.model.Position;
import org.traccar.model.CellTower;

public class GeneratedGetHasIndex_WatchCommand_ReturnsTrue {

    @Test
    public void getHasIndex_WatchCommand_ReturnsTrue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("Watch"));
        assertTrue(decoder.getHasIndex());
    }

}