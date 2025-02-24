package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder protocolDecoder;

    @Test
    public void testGetHasIndex() {
        protocolDecoder = new WatchProtocolDecoder(null);
        boolean hasIndex = protocolDecoder.getHasIndex();
        Assert.assertFalse(hasIndex);
    }

}