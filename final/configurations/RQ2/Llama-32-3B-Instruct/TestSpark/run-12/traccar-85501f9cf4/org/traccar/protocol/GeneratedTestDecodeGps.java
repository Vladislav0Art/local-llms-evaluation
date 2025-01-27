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
public class GeneratedTestDecodeGps {

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
    public void testDecodeGps() {
        boolean result = Gt06ProtocolDecoder.decodeGps(position, new ByteBuf(Unpooled.wrappedBuffer(new byte[]{1})), true, TimeZone.getTimeZone());
        Mockito.verify(baseProtocolDecoder).decode(any(Channel.class), any(SocketAddress.class), any(Object.class));
    }

}