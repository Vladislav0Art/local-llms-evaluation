package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;
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

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder decoder;
    private Channel channel;

    @Test
    public void testGetHasIndex() throws Exception {
        byte[] bytes = BufferUtil.getBytes("test_string");
        decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Object result = decoder.getHasIndex(bytes);
        assertTrue(result instanceof Boolean);
        assertEquals(false, (Boolean) result);
    }

}