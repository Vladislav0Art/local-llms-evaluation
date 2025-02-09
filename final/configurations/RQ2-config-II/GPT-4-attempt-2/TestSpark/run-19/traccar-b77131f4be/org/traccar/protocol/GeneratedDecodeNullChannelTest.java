package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.helper.UnitsConverter;

import static org.junit.Assert.assertNotNull;

public class GeneratedDecodeNullChannelTest {

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocol = new Protocol("galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object result = decoder.decode(null, null, "Test Message");
        assertNotNull(result);
    }

}