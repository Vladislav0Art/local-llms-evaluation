package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecode {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoder;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Network network;

    @Mock
    private CellTower cellTower;

    @Mock
    private WifiAccessPoint wifiAccessPoint;

    @Mock
    private Position position;

    @Test
    public void testDecode() {
        Object result = Gt06ProtocolDecoder.decode(channel, remoteAddress, msg);
        Mockito.verify(baseProtocolDecoder).decode(channel, remoteAddress, msg);
    }

}