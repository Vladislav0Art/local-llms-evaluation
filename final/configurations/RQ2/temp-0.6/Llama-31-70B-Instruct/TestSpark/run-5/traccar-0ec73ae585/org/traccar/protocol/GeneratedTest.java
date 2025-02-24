package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void testGetHasIndex() {
        boolean result = watchProtocolDecoder.getHasIndex();
        Assert.assertTrue(result);
    }

    @Test
    public void testGetManufacturer() {
        String result = watchProtocolDecoder.getManufacturer();
        Assert.assertEquals("Watch", result);
    }

    @Test
    public void testDecode() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);
        Object result = watchProtocolDecoder.decode(channel, remoteAddress, msg);
        Assert.assertNull(result);
    }

}