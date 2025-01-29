package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTestDecode_Galileo_Event_MultipleMessages {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Protocol protocol;

    public static final String MSG = "Hello, world!";
    public static final Protocol PROTOCOL = new Protocol();

    @Test
    public void testDecode_Galileo_Event_MultipleMessages() {
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(PROTOCOL);
        Event[] events = new Event[10];
        for (int i = 0; i < 10; i++) {
            events[i] = new Event();
        }
        String result = decoder.decode("192.168.1.100:1234", remoteAddress, events);
        assertNotNull(result);
    }

}