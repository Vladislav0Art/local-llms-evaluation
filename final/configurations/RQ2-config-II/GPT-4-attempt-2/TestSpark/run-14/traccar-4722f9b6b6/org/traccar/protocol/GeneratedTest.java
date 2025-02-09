package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getHasIndexDefaultFalseTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getHasIndexTrueTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", true));
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertEquals("unknown", decoder.getManufacturer());
    }

    @Test
    public void decodeValidMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress address = new InetSocketAddress("localhost", 5002);

        Position position = (Position) decoder.decode(channel, address, "1234567890");
        assertNotNull(position);
        assertEquals(1234567890, position.getDeviceId());
    }

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress address = new InetSocketAddress("localhost", 5002);

        decoder.decode(channel, address, "invalid_message");
    }

}