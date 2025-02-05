package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private GalileoProtocolDecoder decoder;

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("Galileo");
        decoder = new GalileoProtocolDecoder(protocol);
        assertTrue(decoder instanceof GalileoProtocolDecoder);
    }

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        Protocol protocol = new Protocol("Galileo");
        decoder = new GalileoProtocolDecoder(protocol);
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);
        String invalidMessage = "invalid message";
        Object actual = decoder.decode(channelMock, remoteAddressMock, invalidMessage);
        assertEquals(null, actual);
    }

    @Test
    public void decodeValidMessageTest() throws Exception {
        Protocol protocol = new Protocol("Galileo");
        decoder = new GalileoProtocolDecoder(protocol);
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);
        //Assuming valid message
        String validMessage = "message";
        Object actual = decoder.decode(channelMock, remoteAddressMock, validMessage);
        assertTrue(actual instanceof Position);
    }

    @Test
    public void decodeMultipleValidMessageTest() throws Exception {
        Protocol protocol = new Protocol("Galileo");
        decoder = new GalileoProtocolDecoder(protocol);
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);
        //Assuming valid multiple messages
        String validMessage1 = "message1";
        String validMessage2 = "message2";
        Object actual1 = decoder.decode(channelMock, remoteAddressMock, validMessage1);
        Object actual2 = decoder.decode(channelMock, remoteAddressMock, validMessage2);
        assertTrue(actual1 instanceof Position);
        assertTrue(actual2 instanceof Position);
    }

}