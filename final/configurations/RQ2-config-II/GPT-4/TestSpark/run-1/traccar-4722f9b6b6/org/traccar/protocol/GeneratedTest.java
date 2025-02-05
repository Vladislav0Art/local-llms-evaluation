package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void getHasIndexDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.getManufacturer());
    }

    @Test
    public void decodeValidDataTest() throws Exception {
        String data = "some valid data";
        ByteBuf buffer = Unpooled.copiedBuffer(data.getBytes());

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Object decodedObject = decoder.decode(channel, remoteAddress, buffer);

        assertNotNull(decodedObject);
    }

    @Test
    public void decodeInvalidDataTest() throws Exception {
        ByteBuf buffer = Unpooled.buffer();

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        decoder.decode(channel, remoteAddress, buffer);
    }

    @Test
    public void decodeNullDataTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Object decodedObject = decoder.decode(channel, remoteAddress, null);

        assertNull(decodedObject);
    }

    @Test
    public void decodeEmptyDataTest() throws Exception {
        String data = "";
        ByteBuf buffer = Unpooled.copiedBuffer(data.getBytes());

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Object decodedObject = decoder.decode(channel, remoteAddress, buffer);

        assertNull(decodedObject);
    }

}