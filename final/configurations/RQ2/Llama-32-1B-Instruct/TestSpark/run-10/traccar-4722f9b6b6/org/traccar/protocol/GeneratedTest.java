package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testGetHasIndex() {
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("TRACCA", decoder.getManufacturer());
    }

    @Test
    public void testDecodeChannelSocketAddress() throws Exception {
        Channel channel = Unpooled.buffer().channel();
        SocketAddress remoteAddress = Unpooled.buffer().SocketAddress(123, 456);
        Object msg = Arrays.asList(new NetworkMessage("Hello World"), new WifiAccessPoint("TRACCA", "TRACCA"));
        assertEquals(Arrays.asList(msg), decoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void testDecodeChannelSocketAddress_Invalid() {
        Channel channel = Unpooled.buffer().channel();
        SocketAddress remoteAddress = null;
        Object msg = Arrays.asList(new NetworkMessage("Hello World"), new WifiAccessPoint("TRACCA", "TRACCA"));
        assertEquals(Arrays.asList(msg), decoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void testDecodePosition() throws Exception {
        Position position = new Position(10.0, 20.0);
        Network network = new Network(new CellTower("TRACCA", "TRACCA"));
        Object msg = Arrays.asList(position, network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

    @Test
    public void testDecodePosition_Invalid() {
        Position position = new Position(-10.0, -20.0);
        Network network = null;
        Object msg = Arrays.asList(position, network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

    @Test
    public void testDecodeCellTower() throws Exception {
        CellTower cellTower = new CellTower("TRACCA", "TRACCA");
        Network network = new Network(cellTower);
        Object msg = Arrays.asList(cellTower, network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

    @Test
    public void testDecodeCellTower_Invalid() {
        CellTower cellTower = null;
        Network network = new Network(cellTower);
        Object msg = Arrays.asList(cellTower, network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

    @Test
    public void testDecodeNetwork() throws Exception {
        Network network = new Network(new CellTower("TRACCA", "TRACCA"));
        Object msg = Arrays.asList(network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

    @Test
    public void testDecodeNetwork_Invalid() {
        Network network = null;
        Object msg = Arrays.asList(network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

}