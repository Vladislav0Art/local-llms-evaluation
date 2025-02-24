package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestGetManufacturer {

    private WatchProtocolDecoder protocolDecoder;

    @Test
    public void testGetManufacturer() {
        protocolDecoder = new WatchProtocolDecoder(null);
        String manufacturer = protocolDecoder.getManufacturer();
        Assert.assertNull(manufacturer);
    }

}