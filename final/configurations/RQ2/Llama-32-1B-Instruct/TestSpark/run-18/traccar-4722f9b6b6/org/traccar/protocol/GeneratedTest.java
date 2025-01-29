package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String manufacturer = decoder.getManufacturer();
        assertTrue(!manufacturer.isEmpty());
        assertFalse(manufacturer.equals("Unknown"));
    }

    @Test
    public void testDecodeChannelSocketAddress() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        ByteBuf buffer = BufferUtil.createByteBuf();
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;

        assertFalse(decoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void testDecodeSocketAddress() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        ByteBuf buffer = BufferUtil.createByteBuf();
        SocketAddress remoteAddress = null;
        Object msg = null;

        assertTrue(decoder.decode(buffer, remoteAddress, msg));
    }

    @Test
    public void testDecodeMessage() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        ByteBuf buffer = BufferUtil.createByteBuf();
        Object message = null;

        assertFalse(decoder.decode(buffer, null, message));
    }

    @Test
    public void testDecodeChannelSocketAddress() {
        // Arrange
        When(channel).isDead().thenReturn(false);
        When(remoteAddress).isDead().thenReturn(false);

        // Act
        assertTrue(decoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void testDecodeSocketAddress() {
        // Arrange
        When(channel).isDead().thenReturn(false);
        When(remoteAddress).isDead().thenReturn(true);

        // Act
        assertFalse(decoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void testDecodeMessage() {
        // Arrange
        when(channel()).thenReturn(null);
        when(remoteAddress()).thenReturn(null);
        when(msg()).thenReturn(new Network());

        // Act
        decoder.decode(channel, remoteAddress, msg);

        // Assert
        assertTrue(decoder instanceof WatchProtocolDecoder);
    }

}