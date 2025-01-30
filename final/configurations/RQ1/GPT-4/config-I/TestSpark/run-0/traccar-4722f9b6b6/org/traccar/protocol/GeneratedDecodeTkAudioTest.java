package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.*;

public class GeneratedDecodeTkAudioTest {

    private static WatchProtocolDecoder decoder;
    private static Channel channel;
    private static InetSocketAddress remoteAddress;
    private static DeviceSession deviceSession;

    @BeforeClass
    public static void setUp() {
        Protocol protocol = Mockito.mock(Protocol.class);
        decoder = new WatchProtocolDecoder(protocol);
        channel = Mockito.mock(Channel.class);
        remoteAddress = new InetSocketAddress("localhost", 55000);
        deviceSession = new DeviceSession(7800000000L);
    }

    @AfterClass
    public static void tearDown() {
        decoder = null;
        channel = null;
        remoteAddress = null;
        deviceSession = null;
    }

    @Test
    public void decodeTkAudioTest() throws Exception {
        final ByteBuf buf = Unpooled.copiedBuffer("[3G*7800000000*008A*TK,041119,A,4829.188,N,00903.845,E,0.00,0,14320.0,F,392,1,0,80,33,1]", StandardCharsets.US_ASCII);
        when(channel.attr(any()).get()).thenReturn(deviceSession);

        Position position = (Position) decoder.decode(channel, remoteAddress, buf);

        assertEquals(7800000000L, position.getDeviceId().longValue());
        assertNotNull(position.getAttributes().get(Position.KEY_AUDIO));
    }

}