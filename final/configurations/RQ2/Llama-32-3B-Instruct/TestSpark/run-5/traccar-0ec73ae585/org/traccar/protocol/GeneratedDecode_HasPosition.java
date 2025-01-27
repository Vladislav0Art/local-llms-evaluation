package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_HasPosition {

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
    public void decode_HasPosition() throws Exception {
        protocol.setHasIndex(true);
        protocol.setManufacturer("manufacturer");
        protocol.setPosition(position);
        ByteBuf buffer = Unpooled.buffer();
        NetworkMessage message = new NetworkMessage(buffer, network, deviceSession);
        Object result = new WatchProtocolDecoder(protocol).decode(message.getChannel(), message.getRemoteAddress(), message);
        assertEquals(wifiAccessPoint, result);
    }

}