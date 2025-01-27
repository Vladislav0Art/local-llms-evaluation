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

public class GeneratedDecode_WatchProtocolNoData {

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

}