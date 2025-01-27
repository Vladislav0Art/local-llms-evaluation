package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
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

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

    @Before
    public void setup() {
        // No setup required
    }

    @Test
    public void getHasIndex_[
    AlwaysReturnsTrue]()

    {
        when(channel).thenReturn(remoteAddress);
        boolean hasIndex = decoder.getHasIndex();
        assertTrue(hasIndex);
    }

    @Test
    public void getManufacturer_[
    AlwaysReturnsNull]()

    {
        when(channel).thenReturn(remoteAddress);
        String manufacturer = decoder.getManufacturer();
        assertNull(manufacturer);
    }

    @Test
    public void decode_[
    NoDataFound]()

    {
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(null);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertNull(decodedMessage);
    }

    @Test
    public void decode_[
    EmptyDataReceived]()

    {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeBytes(0);
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(buffer);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertNull(decodedMessage);
    }

    @Test
    public void decode_[
    IncompleteDataReceived]()

    {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0x1000); // invalid length
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(buffer);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertNull(decodedMessage);
    }

    @Test
    public void decode_[
    ValidDataReceived]()

    {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0x1000); // valid length
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(buffer);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(decodedMessage);
    }

    @Test
    public void decode_[
    CellTowerDataReceived]()

    {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0x1001); // valid length
        CellTower cellTower = new CellTower("12345", "45678");
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(buffer);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertSame(cellTower, decodedMessage);
    }

    @Test
    public void decode_[
    NetworkDataReceived]()

    {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0x1002); // valid length
        Network network = new Network("12345", "45678");
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(buffer);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertSame(network, decodedMessage);
    }

    @Test
    public void decode_[
    PositionDataReceived]()

    {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0x1003); // valid length
        Position position = new Position("12345", "45678");
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(buffer);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertSame(position, decodedMessage);
    }

    @Test
    public void decode_[
    WifiAccessPointDataReceived]()

    {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0x1004); // valid length
        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint("12345", "45678");
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(buffer);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertSame(wifiAccessPoint, decodedMessage);
    }

    @Test
    public void decode_[
    TimestampDataReceived]()

    {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(0x1005); // valid length
        Date timestamp = new Date(System.currentTimeMillis());
        when(channel).thenReturn(remoteAddress);
        when(msg).thenReturn(buffer);
        Object decodedMessage = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(decodedMessage);
    }

}