package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

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
    public void decodeHeartbeatPacketTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "[3G*7800000004*000F*SHBR,17]";
        Object decoded = decoder.decode(channel, remoteAddress, Unpooled.wrappedBuffer(msg.getBytes()));
        assertNull(decoded);
        verify(channel).writeAndFlush(any());
    }

    @Test
    public void decodeAlarmPacketTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "[3G*7800000005*000F*LK,0101,1234,600]";
        Object decoded = decoder.decode(channel, remoteAddress, Unpooled.wrappedBuffer(msg.getBytes()));
        assertTrue(decoded instanceof Position);
        verify(channel).writeAndFlush(any());
    }

    @Test
    public void decodeAddressRequestTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "[3G*7800000004*000F*WHERE]";
        Object decoded = decoder.decode(channel, remoteAddress, Unpooled.wrappedBuffer(msg.getBytes()));
        assertNull(decoded);
        verify(channel).writeAndFlush(any());
    }

}