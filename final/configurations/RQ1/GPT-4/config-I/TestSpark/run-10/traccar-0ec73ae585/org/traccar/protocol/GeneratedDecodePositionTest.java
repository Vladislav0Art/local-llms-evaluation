package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.PositionManager;
import org.traccar.network.NetworkManager;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class GeneratedDecodePositionTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

    @Test
    public void decodePositionTest() {
        DeviceSession deviceSession = new DeviceSession(new NetworkManager(null), new IdentityManager());
        String data = "160412065534,A,23.145855,113.361418,20.00,13.00,5.00,4,80.00,49%,,,,,,";

        Position result = decoder.decodePosition(deviceSession, data);

        assertNotNull(result);
        assertEquals(23.145855, result.getLatitude(), 1e-6);
        assertEquals(113.361418, result.getLongitude(), 1e-6);
    }

}