package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
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
import org.traccar.Protocol;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeProtocolTest {

    @Mock
    private Channel channel;

    @Mock
    private DeviceSession deviceSession;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

    @Test
    public void decodeProtocolTest() throws Exception {
        ByteBuf byteBuf = Unpooled.buffer();
        NetworksMessage message = new NetworksMessage();
        when(channel).id().thenReturn(0);
        when(deviceSession).getDevice().thenReturn(new Position());
        when(msg).thenReturn(message);

        decoder.decode(channel, deviceSession, msg);
    }

}