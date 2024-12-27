package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_GalileoData_DecodesCorrectly {

    @Mock
    private BaseProtocolDecoder baseProtocolDecoder;

    @Test
    public void decode_GalileoData_DecodesCorrectly() {
        // Arrange
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object[] data = "galileo data".getBytes();
        Object msg = "test";

        when(channel.decode(any(), any())).thenReturn(data);

        // Act
        Object result = galileoProtocolDecoder.decode(channel, remoteAddress, msg);

        // Assert
        assertEquals(galileoProtocolDecoder.decode(channel, remoteAddress, msg), result);
    }

}