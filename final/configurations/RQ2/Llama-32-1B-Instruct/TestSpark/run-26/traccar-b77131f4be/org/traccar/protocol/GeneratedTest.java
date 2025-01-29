package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testDecode_GalileoVersion_1() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 1.0");
        assertEquals("Galileo: 1.0", (String) result);
    }

    @Test
    public void testDecode_GalileoVersion_2() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 2.0");
        assertEquals("Galileo: 2.0", (String) result);
    }

    @Test
    public void testDecode_GalileoVersion_3() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 3.0");
        assertEquals("Galileo: 3.0", (String) result);
    }

    @Test
    public void testDecode_GalileoError() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        try {
            new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals("Galileo: unknown error", e.getMessage());
        }
    }

    @Test
    public void testDecode_GalileoError_1() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        try {
            new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals("Galileo: unknown error", e.getMessage());
        }
    }

    @Test
    public void testDecode_GalileoError_2() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoVersion_4() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 4.0");
        assertEquals("Galileo: 4.0", (String) result);
    }

    @Test
    public void testDecode_GalileoError_3() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoError_4() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoError_5() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoError_6() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoVersion_5() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 5.0");
        assertEquals("Galileo: 5.0", (String) result);
    }

    @Test
    public void testDecode_GalileoError_7() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoError_8() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoVersion_6() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 6.0");
        assertEquals("Galileo: 6.0", (String) result);
    }

    @Test
    public void testDecode_GalileoError_9() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoError_10() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        fail("Expected exception not thrown");
    }

    @Test
    public void testDecode_GalileoVersion_7() {
        Object result = new GalileoProtocolDecoder(new Protocol()).decode(null, null, "Galileo: 7.0");
        assertEquals("Galileo: 7.0", (String) result);
    }

}