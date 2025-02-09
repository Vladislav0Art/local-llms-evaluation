package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.protocol.WatchProtocolDecoder;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void decodeTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        byte[] testBytes = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05};
        Object decoded = decoder.decode(channel, null, testBytes);
        assertNotNull(decoded);
    }

}