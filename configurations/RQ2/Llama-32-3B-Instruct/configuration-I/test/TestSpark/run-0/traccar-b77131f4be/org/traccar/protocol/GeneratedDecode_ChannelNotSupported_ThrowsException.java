package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_ChannelNotSupported_ThrowsException {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoder;

    @Test
    public void decode_ChannelNotSupported_ThrowsException() {
        // Arrange
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "test";

        when(channel.isSupported(any())).thenReturn(false);

        // Act and Assert
        Exception exception = assertThrows(Exception.class, () -> galileoProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}