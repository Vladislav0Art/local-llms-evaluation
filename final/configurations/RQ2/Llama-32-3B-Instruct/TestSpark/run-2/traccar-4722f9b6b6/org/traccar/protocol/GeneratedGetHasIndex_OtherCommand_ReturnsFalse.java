package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.model.Position;
import org.traccar.model.CellTower;

public class GeneratedGetHasIndex_OtherCommand_ReturnsFalse {

    @Test
    public void getHasIndex_OtherCommand_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("Other"));
        assertFalse(decoder.getHasIndex());
    }

}