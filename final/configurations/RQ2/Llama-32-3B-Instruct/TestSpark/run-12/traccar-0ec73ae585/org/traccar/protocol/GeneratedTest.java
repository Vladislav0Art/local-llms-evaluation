package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Test
    public void decode_WatchProtocol_WithoutIndex_ReturnsNull() {
        ByteBuf buffer = Unpooled.buffer();
        when(msg).thenReturn(buffer);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        Object result = decoder.decode(channel, remoteAddress, msg);
        assertTrue(result == null);
    }

    @Test
    public void decode_WatchProtocol_WithIndex_ReturnsPosition() {
        ByteBuf buffer = Unpooled.buffer();
        when(msg).thenReturn(buffer);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        Object result = decoder.decode(channel, remoteAddress, msg);
        assertTrue(result instanceof Position);
    }

    @Test
    public void decode_WatchProtocol_WithCellTower_ReturnsCellTower() {
        ByteBuf buffer = Unpooled.buffer();
        when(msg).thenReturn(buffer);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        Object result = decoder.decode(channel, remoteAddress, msg);
        assertTrue(result instanceof CellTower);
    }

    @Test
    public void decode_WatchProtocol_WithNetwork_ReturnsNetwork() {
        ByteBuf buffer = Unpooled.buffer();
        when(msg).thenReturn(buffer);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        Object result = decoder.decode(channel, remoteAddress, msg);
        assertTrue(result instanceof Network);
    }

    @Test
    public void decode_WatchProtocol_WithWifiAccessPoint_ReturnsWifiAccessPoint() {
        ByteBuf buffer = Unpooled.buffer();
        when(msg).thenReturn(buffer);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        Object result = decoder.decode(channel, remoteAddress, msg);
        assertTrue(result instanceof WifiAccessPoint);
    }

    @Test
    public void getHasIndex_WatchProtocol_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        boolean hasIndex = decoder.getHasIndex();
        assertTrue(hasIndex == false);
    }

    @Test
    public void getManufacturer_WatchProtocol_ReturnsManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        String manufacturer = decoder.getManufacturer();
        assertEquals("Manufacturer", manufacturer);
    }

}