package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.helper.UnitsConverter;

import static org.junit.Assert.assertNotNull;

public class GeneratedDecodeWithChannelAndRemoteAddressTest {

    @Test
    public void decodeWithChannelAndRemoteAddressTest() throws Exception {
        Protocol protocol = new Protocol("galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);

        Object result = decoder.decode(channel, "192.168.1.1", "Test Message");
        assertNotNull(result);
    }

}