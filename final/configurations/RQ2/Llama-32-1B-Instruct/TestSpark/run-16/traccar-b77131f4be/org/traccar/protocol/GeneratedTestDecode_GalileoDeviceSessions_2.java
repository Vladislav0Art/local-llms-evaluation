package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GeneratedTestDecode_GalileoDeviceSessions_2 {

    @Test
    public void testDecode_GalileoDeviceSessions_2() throws Exception {
        Protocol protocol = new Protocol();
        DeviceSession deviceSession = new DeviceSession();
        SocketAddress remoteAddress = "192.168.0.1";
        Object msg = new NetworkMessage();

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertEquals("GalileoDeviceSessions", decoder.decodeChannel(channel, remoteAddress, msg));
    }

}