package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNullMessageTest {

    @Mock
    private Protocol protocol;
    @Mock
    private Channel channel;

    @Test
    public void decodeNullMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertEquals(null, decoder.decode(channel, null, null));
    }

}