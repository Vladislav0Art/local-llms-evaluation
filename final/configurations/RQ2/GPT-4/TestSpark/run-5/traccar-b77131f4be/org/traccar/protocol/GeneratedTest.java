package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void decodeInvalidPayloadTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 50000);

        Object decoded = decoder.decode(channel, remoteAddress, "InvalidPayload");

        assertEquals(decoded, null);
    }

    @Test
    public void decodeValidPayloadTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 50000);

        Object decoded = decoder.decode(channel, remoteAddress, "ValidPayload");

        if (decoded instanceof Position) {
            assertEquals(((Position) decoded).getProtocol(), "test");
        }
    }

    @Test
    public void decodePayloadWithDeviceSessionTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = Mockito.spy(new GalileoProtocolDecoder(protocol));

        Channel channel = mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 50000);

        Object decoded = decoder.decode(channel, remoteAddress, "PayloadWithDeviceSession");

        if (decoded instanceof Position) {
            assertEquals(((Position) decoded).getDeviceId(), 0);
        }
    }

}