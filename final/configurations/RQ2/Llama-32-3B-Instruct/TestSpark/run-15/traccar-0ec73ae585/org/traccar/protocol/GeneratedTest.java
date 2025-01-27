package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.regex.Pattern;

import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

public class GeneratedTest {

    @Test
    public void decode_WatchWatchMessage

    Test() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Date date = new Date();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH Protocol);
        byte[] result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_WatchCellTowerMessage

    Test() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Date date = new Date();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH CellTower Protocol);
        byte[] result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_WatchNetworkMessage

    Test() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Date date = new Date();
        WatchProtocolDecoder decoder = new WatchProtocolDealer(Protocol.WATCH Network Protocol);
        byte[] result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_WatchPositionMessage

    Test() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Date date = new Date();
        WatchProtocolDecoder decoder = new WatchProtocolDealer(Protocol.WATCH Position Protocol);
        byte[] result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_WatchWifiAccessPointMessage

    Test() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Date date = new Date();
        WatchProtocolDecoder decoder = new WatchProtocolDealer(Protocol.WATCH WifiAccessPoint Protocol);
        byte[] result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

    @Test
    public void getHasIndex_WatchWatchMessage

    Test() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH Protocol);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void getHasIndex_WatchCellTowerMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH CellTower Protocol);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getHasIndex_WatchNetworkMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH Network Protocol);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void getHasIndex_WatchPositionMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH Position Protocol);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getHasIndex_WatchWifiAccessPointMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH WifiAccessPoint Protocol);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void getManufacturer_WatchWatchMessage

    Test() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH Protocol);
        assertEquals("Traccar", decoder.getManufacturer());
    }

    @Test
    public void getManufacturer_WatchCellTowerMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH CellTower Protocol);
        assertEquals("Traccar", decoder.getManufacturer());
    }

    @Test
    public void getManufacturer_WatchNetworkMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH Network Protocol);
        assertEquals("Traccar", decoder.getManufacturer());
    }

    @Test
    public void getManufacturer_WatchPositionMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH Position Protocol);
        assertEquals("Traccar", decoder.getManufacturer());
    }

    @Test
    public void getManufacturer_WatchWifiAccessPointMessage

    Test() {
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH WifiAccessPoint Protocol);
        assertEquals("Traccar", decoder.getManufacturer());
    }

}