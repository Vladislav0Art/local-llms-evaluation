package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.protocol.WatchProtocolDecoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexReturnFalseTest {

    @Mock
    private Channel channel;

    @Test
    public void getHasIndexReturnFalseTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        boolean result = decoder.getHasIndex();
        Assert.assertEquals(false, result);
    }

}