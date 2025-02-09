package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturerDefaultStateTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void getManufacturerDefaultStateTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNull(decoder.getManufacturer());
    }

}