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

public class GeneratedDecodeTkTest {

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
    public void decodeTkTest() throws Exception {
        final ByteBuf buf = Unpooled.copiedBuffer("[3G*7800000000*000F*TK]", StandardCharsets.US_ASCII);

        Position position = (Position) decoder.decode(channel, remoteAddress, buf);

        assertEquals(7800000000L, position.getDeviceId().longValue());
    }

}