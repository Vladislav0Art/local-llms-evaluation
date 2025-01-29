package org.traccar.protocol;

import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        WatchProtocolDecoder protocolDecoder = new WatchProtocolDecoder(protocolDecoder);
        Assert.assertTrue(decoder.getHasIndex());
    }

}