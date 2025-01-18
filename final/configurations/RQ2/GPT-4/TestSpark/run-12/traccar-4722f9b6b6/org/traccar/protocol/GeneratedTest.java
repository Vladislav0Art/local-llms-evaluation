package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

public class GeneratedTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void getHasIndexTest() {
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        assertEquals("", decoder.getManufacturer());
    }

    @Test
    public void decodeNullMessageTest() throws Exception {
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        Object decodedMessage = decoder.decode(channel, remoteAddress, null);

        assertNull(decodedMessage);
    }

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        Object decodedMessage = decoder.decode(channel, remoteAddress, "");

        assertNull(decodedMessage);
    }

    @Test
    public void decodeSpecificMessageFormatTest() throws Exception {
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        String formattedMessage = "[3G*7800000207*00FA*LK,221122,00,83089,45]";
        Object decodedMessage = decoder.decode(channel, remoteAddress, formattedMessage);

        assertNotNull(decodedMessage);
    }

}