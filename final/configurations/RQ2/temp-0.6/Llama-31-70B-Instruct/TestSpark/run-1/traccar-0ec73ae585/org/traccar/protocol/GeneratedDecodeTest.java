package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.session.DeviceSession;

public class GeneratedDecodeTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeTest() throws Exception {
        decoder = new WatchProtocolDecoder(new Protocol());
        Object result = decoder.decode(null, null, null);
        assertNull(result);
    }

}