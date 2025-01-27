package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_PlaceholderMessage_ReturnsPlaceholder {

    @Mock
    private Protocol protocol;

    @Mock
    private NetworkMessage networkMessage;

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public void setNetworkMessage(NetworkMessage networkMessage) {
        this.networkMessage = networkMessage;
    }

    @Test
    public void decode_PlaceholderMessage_ReturnsPlaceholder() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        networkMessage.setChannel(channel);
        networkMessage.setRemoteAddress(remoteAddress);

        when(networkMessage.getMessage()).thenReturn(new byte[]{4});
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        Object placeholder = watchProtocolDecoder.decode(channel, remoteAddress, networkMessage);

        assertNotNull(placeholder);
    }

}