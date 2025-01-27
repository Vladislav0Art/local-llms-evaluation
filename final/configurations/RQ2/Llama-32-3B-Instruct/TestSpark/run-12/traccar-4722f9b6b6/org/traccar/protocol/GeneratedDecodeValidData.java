package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidData {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private NetworkMessage networkMessage;

    @Test
    public void decodeValidData() throws Exception {
        when(channel.alloc()).thenReturn(Unpooled.buffer(100));
        BufferUtil.writeByte(0, channel.alloc());
        BufferUtil.writeShort(1, channel.alloc());
        BufferUtil.writeLong(2L, channel.alloc());
        Network network = new Network("Network", deviceSession);
        PatternBuilder patternBuilder = new PatternBuilder();
        patternBuilder.add(new Position(20.34567, -34.56789));
        patternBuilder.add(new CellTower(1, 12345));
        patternBuilder.add(new WifiAccessPoint(10.23456, "Network"));
        when(networkMessage.getBuffer()).thenReturn(PatternBuilder.parse(patternBuilder.build()));
        when(deviceSession.getId()).thenReturn("1");
        Object result = WatchProtocolDecoder.class.getMethod("decode", Channel.class, SocketAddress.class, Object.class).invoke(null, channel, networkMessage.getAddress(), networkMessage);
        assertNotNull(result);
    }

}