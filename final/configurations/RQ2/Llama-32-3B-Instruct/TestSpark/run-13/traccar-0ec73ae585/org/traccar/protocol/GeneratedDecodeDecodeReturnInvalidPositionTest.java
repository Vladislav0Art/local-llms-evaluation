package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeDecodeReturnInvalidPositionTest {

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private ByteBuf byteBuf;

    @Test
    public void decodeDecodeReturnInvalidPositionTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Position position = PositionFactory.create("invalidPosition");
        NetworkMessageBuilder networkMessageBuilder = Mockito.mock(NetworkMessageBuilder.class);
        when(networkMessageBuilder.build()).thenReturn(networkMessage);
        when(byteBuf.readLong()).thenReturn(position.getLongitude());
        decoder.decode(channel, remoteAddress, msg);
    }

}