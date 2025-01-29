package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTestDecode_Galileo_Position {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Protocol protocol;

    public static final String MSG = "Hello, world!";
    public static final Protocol PROTOCOL = new Protocol();

    @Test
    public void testDecode_Galileo_Position() {
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(PROTOCOL);
        Position position = new Position(37.7749, -122.4194);
        String result = decoder.decode("192.168.1.100:1234", remoteAddress, position);
        assertNotNull(result);
        assertEquals(position, result);
    }

}