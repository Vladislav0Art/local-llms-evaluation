package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecode_Galileo_Event_WithStringArgument {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Protocol protocol;

    public static final String MSG = "Hello, world!";
    public static final Protocol PROTOCOL = new Protocol();

    @Test
    public void testDecode_Galileo_Event_WithStringArgument() throws Exception {
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(PROTOCOL);
        String arg1 = "Hello";
        String arg2 = ", world!";
        String result = decoder.decode("192.168.1.100:1234", remoteAddress, arg1 + "," + arg2);
        assertNotNull(result);
    }

}