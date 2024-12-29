package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
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
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest_DecodesMessageWithNullPayload {

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Test
    public void decodeTest_DecodesMessageWithNullPayload() throws Exception {
        NetworkMessage message = new NetworkMessage();
        message.setProtocol("Watch");
        message.setPayload(null);
        Object result = decoder.decode(null, null, message);
        assertNotNull(result);
    }

}