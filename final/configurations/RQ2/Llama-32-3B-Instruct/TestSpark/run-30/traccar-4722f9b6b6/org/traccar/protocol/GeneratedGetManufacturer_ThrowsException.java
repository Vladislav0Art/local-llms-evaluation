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
public class GeneratedGetManufacturer_ThrowsException {

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
    public void getManufacturer_ThrowsException() {
        when(protocol.getWatchProtocol()).thenReturn("[]");
        assertThrows(NullPointerException.class, WatchProtocolDecoder.class::getMethod);
    }

}