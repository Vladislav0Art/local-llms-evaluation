package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getHasIndex_EmptyResponse_ReturnsFalse() {
        byte[] response = new byte[0];
        when(channel.receive()).thenReturn(response);
        boolean hasIndex = watchProtocolDecoder.getHasIndex();
        assertEquals(false, hasIndex);
    }

    @Test
    public void getHasIndex_ResponseWithIndex_ReturnsTrue() {
        ByteBuf response = Unpooled.copiedBuffer("index:1".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        boolean hasIndex = watchProtocolDecoder.getHasIndex();
        assertEquals(true, hasIndex);
    }

    @Test
    public void getManufacturer_EmptyResponse_ReturnsEmptyString() {
        byte[] response = new byte[0];
        when(channel.receive()).thenReturn(response);
        String manufacturer = watchProtocolDecoder.getManufacturer();
        assertEquals("", manufacturer);
    }

    @Test
    public void getManufacturer_ResponseWithManufacturer_ReturnsCorrectValue() {
        ByteBuf response = Unpooled.copiedBuffer("manufacturer:ABC".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        String manufacturer = watchProtocolDecoder.getManufacturer();
        assertEquals("ABC", manufacturer);
    }

    @Test
    public void decode_EmptyResponse_ReturnsNull() throws Exception {
        byte[] response = new byte[0];
        when(channel.receive()).thenReturn(response);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, null);
        assertNull(decoded);
    }

    @Test
    public void decode_ResponseWithNetwork_ReturnsCorrectObject() throws Exception {
        ByteBuf response = Unpooled.copiedBuffer("network:1,5,10".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, null);
        Network network = (Network) decoded;
        assertEquals(1, network.getId());
        assertEquals(5, network.getLatitude());
        assertEquals(10, network.getLongitude());
    }

    @Test
    public void decode_ResponseWithPosition_ReturnsCorrectObject() throws Exception {
        ByteBuf response = Unpooled.copiedBuffer("position:1,5,10".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, null);
        Position position = (Position) decoded;
        assertEquals(1, position.getId());
        assertEquals(5, position.getLatitude());
        assertEquals(10, position.getLongitude());
    }

    @Test
    public void decode_ResponseWithCellTower_ReturnsCorrectObject() throws Exception {
        ByteBuf response = Unpooled.copiedBuffer("celltower:1,5".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, null);
        CellTower cellTower = (CellTower) decoded;
        assertEquals(1, cellTower.getId());
        assertEquals(5, cellTower.getSignalStrength());
    }

    @Test
    public void decode_ResponseWithWifiAccessPoint_ReturnsCorrectObject() throws Exception {
        ByteBuf response = Unpooled.copiedBuffer("wifiaccesspoint:1,5".getBytes(StandardCharsets.UTF_8));
        when(channel.receive()).thenReturn(response);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, null);
        WifiAccessPoint wifiAccessPoint = (WifiAccessPoint) decoded;
        assertEquals(1, wifiAccessPoint.getId());
        assertEquals(5, wifiAccessPoint.getSignalStrength());
    }

    @Test
    public void decode_EmptyMessage_ReturnsNull() {
        Object message = null;
        when(channel.receive()).thenReturn(new byte[0]);
        Object decoded = watchProtocolDecoder.decode(channel, remoteAddress, message);
        assertNull(decoded);
    }

}