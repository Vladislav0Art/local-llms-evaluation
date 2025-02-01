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

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        Channel channel = Mockito.mock(Channel.class);
        remoteAddress = new InetSocketAddress("localhost", 5555);
        DeviceSession deviceSession = getDeviceSession(channel, remoteAddress, "1234");

        assertNotNull(deviceSession);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        decoder.sendResponse(channel, "1234", "0007", "UD2,153615,020916,1146377879,1725259333,11,0,3,4250,3,0000000000000,01,470,02,3551,22426,M01S,31,0,0,0");
    }

}