package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

import javax.annotation.Nullable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getHasIndexDefaultTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.getManufacturer());
    }

    @Test
    public void decodeNullTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(null, null, null));
    }

    @Test
    public void decodeNonNullTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        InetSocketAddress address = mock(InetSocketAddress.class);
        ByteBuf msg = Unpooled.buffer();

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(null, address, msg));
    }

}