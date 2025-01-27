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
public class GeneratedDecode_WifiAccessPointMessage_ReturnsWifiAccessPoint {

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
    public void decode_WifiAccessPointMessage_ReturnsWifiAccessPoint() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        networkMessage.setChannel(channel);
        networkMessage.setRemoteAddress(remoteAddress);

        when(networkMessage.getMessage()).thenReturn(new byte[]{2});
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        Object wifiAccessPoint = watchProtocolDecoder.decode(channel, remoteAddress, networkMessage);

        assertTrue(wifiAccessPoint instanceof WifiAccessPoint);
    }

}