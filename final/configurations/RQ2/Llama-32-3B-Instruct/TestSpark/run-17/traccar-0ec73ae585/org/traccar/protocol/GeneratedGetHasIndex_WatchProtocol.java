package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetHasIndex_WatchProtocol {

    @Test
    public void getHasIndex_WatchProtocol() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(WatchProtocol.class);
        assertTrue(decoder.getHasIndex());
    }

}