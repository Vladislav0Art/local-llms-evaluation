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

public class GeneratedTest {

    @Test
    public void decode_WatchProtocolSuccess() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(WatchProtocol.class);
        DeviceSession session = new DeviceSession("Device", "Session");
        Network network = mock(Network.class);
        CellTower cellTower = mock(CellTower.class);

        when(network.getName()).thenReturn("Network");
        when(cellTower.getId()).thenReturn("CellID");

        ByteBuf buffer = Unpooled.buffer();
        buffer.writeBytes(0x00, 0x01, 0x02, 0x03);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Object result = decoder.decode(channel, remoteAddress, session);
        assertNotNull(result);
        assertTrue(BitUtil.isBitSet(result));
    }

    @Test
    public void decode_WatchProtocolNoData() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(WatchProtocol.class);
        DeviceSession session = new DeviceSession("Device", "Session");
        Network network = mock(Network.class);

        when(network.getName()).thenReturn("Network");

        ByteBuf buffer = Unpooled.buffer();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Object result = decoder.decode(channel, remoteAddress, session);
        assertNull(result);
    }

    @Test
    public void getHasIndex_WatchProtocol() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(WatchProtocol.class);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void getManufacturer_WatchProtocol() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(WatchProtocol.class);
        assertEquals("WatchProtocol", decoder.getManufacturer());
    }

}