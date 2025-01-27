package org.traccar.protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
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
import org.traccar.session.DeviceSession;

public class GeneratedDecodeDecodeTest {

    @Test
    public void DecodeDecodeTest() {
        DeviceSession device = new DeviceSession();
        ByteBuf buf = Unpooled.buffer(10);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(WatchProtocol.class);

        NetworkMessage message = mock(NetworkMessage.class);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        decoder.decode(channel, remoteAddress, msg);

        verify(message).decode(buf);
    }

}