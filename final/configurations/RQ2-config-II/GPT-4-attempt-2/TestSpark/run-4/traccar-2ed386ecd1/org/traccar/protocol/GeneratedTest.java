package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private final Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

    @Mock
    private Channel channel;

    private ByteBuf buf(String data) {
        return Unpooled.copiedBuffer(data.getBytes(StandardCharsets.ISO_8859_1));
    }

    @Test
    public void decodeGpsTestWithLength() {
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf("8,022689.0000,W,5128.6450,N,0.00,,080821,FFFFFBFF,99,06,1008,60"), true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsTestWithoutLength() {
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf("122.227152,36.681385,060721 064432,2,0,183,8"), false, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsTestWithMultipleFlags() {
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf("8,122.227152,36.681385,060721 064432,2,0,183,8"), true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsTestWithInvalidData() {
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf("invalid,data,does,not,match,pattern"), false, TimeZone.getDefault()));
    }

    @Test
    public void decodeTestWithValidData() throws Exception {
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress("localhost", 5005));
        assertNotNull(decoder.decode(channel, null, buf("78781f120f0a0b10060701cc027ac4003a38010d0a")));
    }

    @Test
    public void decodeTestWithInvalidData() throws Exception {
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress("localhost", 5005));
        assertNull(decoder.decode(channel, null, buf("invalid,data,does,not,match,pattern")));
    }

}