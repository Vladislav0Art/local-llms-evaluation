package org.traccar.protocol;

import org.traccar.protocol.WatchProtocolDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import io.netty.channel.Channel;
import org.traccar.Protocol;

public class GeneratedDecodeReturnsObjectTest {

    @Mock
    private Channel channel;
    @Mock
    private Protocol protocol;

    @Test
    public void decodeReturnsObjectTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(channel, Mockito.any(), "test message");
        Assert.assertNull(result);
    }

}