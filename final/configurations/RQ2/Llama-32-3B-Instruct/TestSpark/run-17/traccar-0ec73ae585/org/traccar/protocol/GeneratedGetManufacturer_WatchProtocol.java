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

public class GeneratedGetManufacturer_WatchProtocol {

    @Test
    public void getManufacturer_WatchProtocol() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(WatchProtocol.class);
        assertEquals("WatchProtocol", decoder.getManufacturer());
    }

}