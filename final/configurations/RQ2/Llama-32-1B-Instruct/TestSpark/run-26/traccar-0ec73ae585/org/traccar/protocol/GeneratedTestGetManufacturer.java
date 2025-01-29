package org.traccar.protocol;

import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        WatchProtocolDecoder protocolDecoder = new WatchProtocolDecoder(protocolDecoder);
        String manufacturer = protocolDecoder.getManufacturer();
        Assert.assertNotNull(manufacturer);
        Assert.assertTrue(Pattern.matches("^[A-Z]+$", manufacturer));
    }

}