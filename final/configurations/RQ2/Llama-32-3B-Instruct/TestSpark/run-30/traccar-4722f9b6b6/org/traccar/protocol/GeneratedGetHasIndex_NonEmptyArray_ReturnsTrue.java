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
public class GeneratedGetHasIndex_NonEmptyArray_ReturnsTrue {

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
    public void getHasIndex_NonEmptyArray_ReturnsTrue() {
        when(protocol.getWatchProtocol()).thenReturn("[1]");
        assertTrue(WatchProtocolDecoder.class.getMethod("getHasIndex", protocol.getClass()).invoke(null, protocol));
    }

}