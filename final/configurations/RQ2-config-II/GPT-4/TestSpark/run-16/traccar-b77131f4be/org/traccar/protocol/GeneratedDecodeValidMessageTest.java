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

public class GeneratedDecodeValidMessageTest {

    private GalileoProtocolDecoder decoder;

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

}