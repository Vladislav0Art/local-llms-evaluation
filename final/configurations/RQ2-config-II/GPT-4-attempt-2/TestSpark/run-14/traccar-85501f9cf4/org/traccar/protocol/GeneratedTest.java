package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static final String TEST_PROTOCOL = "TEST_PROTOCOL";
    @Mock
    private Channel channel;

    @Test
    public void decodeGpsWithLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(TEST_PROTOCOL));
        Position position = new Position();
        TimeZone timeZone = TimeZone.getDefault();
        assertTrue(decoder.decodeGps(position, Unpooled.copiedBuffer("1234567890ABCDEF", StandardCharsets.UTF_8), true, timeZone));
    }

    @Test
    public void decodeGpsWithoutLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(TEST_PROTOCOL));
        Position position = new Position();
        TimeZone timeZone = TimeZone.getDefault();
        assertTrue(decoder.decodeGps(position, Unpooled.copiedBuffer("1234567890ABCDEF", StandardCharsets.UTF_8), false, timeZone));
    }

    @Test
    public void decodeGpsWithSatellitesAndSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(TEST_PROTOCOL));
        Position position = new Position();
        TimeZone timeZone = TimeZone.getDefault();
        assertTrue(decoder.decodeGps(position, Unpooled.copiedBuffer("1234567890ABCDEF", StandardCharsets.UTF_8), false, true, true, timeZone));
    }

    @Test
    public void decodeGpsWithoutSatellitesAndSpeedTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(TEST_PROTOCOL));
        Position position = new Position();
        TimeZone timeZone = TimeZone.getDefault();
        assertTrue(decoder.decodeGps(position, Unpooled.copiedBuffer("1234567890ABCDEF", StandardCharsets.UTF_8), false, false, false, timeZone));
    }

    @Test
    public void decodeWithChannelAndRemoteAddressTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(TEST_PROTOCOL));
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "TEST_MESSAGE";
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

}