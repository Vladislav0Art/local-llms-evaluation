package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTestDecode_Galileo_List {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Protocol protocol;

    public static final String MSG = "Hello, world!";
    public static final Protocol PROTOCOL = new Protocol();

    @Test
    public void testDecode_Galileo_List() {
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(PROTOCOL);
        List<DeviceSession> devices = new ArrayList<>();
        devices.add(new DeviceSession("192.168.1.101:1234", "device1"));
        String result = decoder.decode("192.168.1.100:1234", remoteAddress, devices);
        assertNotNull(result);
        assertEquals(devices, result);
    }

}