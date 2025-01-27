package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndex_EmptyProtocol {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Network network;

    @Mock
    private Position position;

    @Mock
    private CellTower cellTower;

    @Mock
    private WifiAccessPoint wifiAccessPoint;

    @Test
    public void getHasIndex_EmptyProtocol() {
        boolean result = new WatchProtocolDecoder(protocol).getHasIndex();
        assertTrue(result);
    }

}