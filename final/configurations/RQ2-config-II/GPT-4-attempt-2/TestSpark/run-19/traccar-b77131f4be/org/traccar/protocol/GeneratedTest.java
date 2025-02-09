package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.helper.UnitsConverter;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void galileoProtocolDecoderCreationTest() {
        Protocol protocol = new Protocol("galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocol = new Protocol("galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Object result = decoder.decode(null, null, "Test Message");
        assertNotNull(result);
    }

    @Test
    public void decodeWithChannelTest() throws Exception {
        Protocol protocol = new Protocol("galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);

        Object result = decoder.decode(channel, null, "Test Message");
        assertNotNull(result);
    }

    @Test
    public void decodeWithChannelAndRemoteAddressTest() throws Exception {
        Protocol protocol = new Protocol("galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);

        Object result = decoder.decode(channel, "192.168.1.1", "Test Message");
        assertNotNull(result);
    }

    @Test
    public void decodeWithChannelRemoteAddressAndMsgTest() throws Exception {
        Protocol protocol = new Protocol("galileo");
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);

        Object result = decoder.decode(channel, "192.168.1.1", "Test Message");
        assertNotNull(result);
    }

}