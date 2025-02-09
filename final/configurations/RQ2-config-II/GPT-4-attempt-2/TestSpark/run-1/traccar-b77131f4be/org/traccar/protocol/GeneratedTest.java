package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.TestDataManager;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Position position;

    @Test
    public void decodeWithNullChannelTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "some message";
        decoder.decode(null, remoteAddress, msg);
        verifyZeroInteractions(remoteAddress);
    }

    @Test
    public void decodeWithNullRemoteAddressTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        Object msg = "other message";
        decoder.decode(channel, null, msg);
        verifyZeroInteractions(channel);
    }

    @Test
    public void decodeWithNullMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        decoder.decode(channel, remoteAddress, null);
        verifyZeroInteractions(channel, remoteAddress);
    }

    @Test
    public void decodeWithValidParamsTest() throws Exception {
        when(protocol.getDeviceSession(null, null)).thenReturn(null);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "valid message";

        Object result = decoder.decode(channel, remoteAddress, msg);

        verify(channel, times(1)).writeAndFlush(any(NetworkMessage.class));
        assertEquals(position, result);
    }

}