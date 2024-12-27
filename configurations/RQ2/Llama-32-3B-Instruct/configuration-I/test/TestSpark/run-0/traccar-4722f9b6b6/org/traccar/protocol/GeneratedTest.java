package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.InetSocketAddress;

public class GeneratedTest {

    @Test
    public void decode_WildcardMessage_ReturnsNull() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = null;
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertNull(result);
    }

    @Test
    public void decode_WildcardMessageWithIndex_ReturnsNull() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new WildcardMessage();
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertNull(result);
    }

    @Test
    public void decode_SingleByteCommand_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new SingleByteMessage('1');
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertEquals(1, result);
    }

    @Test
    public void decode_TwoByteCommand_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new TwoByteMessage((byte) 1, (byte) 2);
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertEquals(0x12, result);
    }

    @Test
    public void decode_FourByteCommand_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new FourByteMessage(1, 2, 3, 4);
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertEquals(16384, result);
    }

    @Test
    public void decode_MultipleCommands_ReturnsExpectedValues() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new MultipleByteMessage((byte) 1, (byte) 2, (byte) 3, (byte) 4);
        Object[] result = decoder.decode(channel, remoteAddress, msg);
        assertEquals(4, result.length);
    }

    @Test
    public void getHasIndex_WildcardMessage_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new WildcardMessage();
        assertFalse(decoder.getHasIndex(channel, remoteAddress, msg));
    }

    @Test
    public void getHasIndex_SingleByteCommand_ReturnsTrue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new SingleByteMessage('1');
        assertTrue(decoder.getHasIndex(channel, remoteAddress, msg));
    }

    @Test
    public void getManufacturer_WildcardMessage_ReturnsEmptyString() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new WildcardMessage();
        assertEquals("", decoder.getManufacturer(channel, remoteAddress, msg));
    }

    @Test
    public void getManufacturer_SingleByteCommand_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new SingleByteMessage('1');
        assertEquals("Manufacturer 1", decoder.getManufacturer(channel, remoteAddress, msg));
    }

    @Test
    public void getManufacturer_MultipleCommands_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new MultipleByteMessage((byte) '1', (byte) '2', (byte) '3', (byte) '4');
        assertEquals("Manufacturer 1234", decoder.getManufacturer(channel, remoteAddress, msg));
    }

}