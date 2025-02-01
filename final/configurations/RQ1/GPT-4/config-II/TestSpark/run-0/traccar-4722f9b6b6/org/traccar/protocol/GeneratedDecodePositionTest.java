package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 5555);

        assertNotNull(decoder.decodePosition(Mockito.mock(DeviceSession.class), "GPS Tracker"));
    }

}