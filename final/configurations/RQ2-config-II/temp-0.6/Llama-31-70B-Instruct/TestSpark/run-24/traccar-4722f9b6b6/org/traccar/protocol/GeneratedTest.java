package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    WatchProtocolDecoder .class
})

@SuppressStaticInitializationFor("org.traccar.protocol.WatchProtocolDecoder")
public class WatchProtocolDecoderTest {

    private WatchProtocolDecoder testClass;

    @Before
    public void setUp() {
        testClass = new WatchProtocolDecoder();
    }

    @Test
    public void decodeTest() {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);
        Object result = testClass.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

    @Test
    public void getHasIndexTest() {
        boolean result = testClass.getHasIndex();
        assertNotNull(result);
    }

    @Test
    public void getManufacturerTest() {
        String result = testClass.getManufacturer();
        assertNotNull(result);
    }

}