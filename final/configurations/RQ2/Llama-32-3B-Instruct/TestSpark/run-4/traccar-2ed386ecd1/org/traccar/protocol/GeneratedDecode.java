package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedDecode {

    @Mock
    private ByteBuf buf;

    @Mock
    private Position position;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void decode() {
        // Arrange
        when(channel.getChannel()).thenReturn(buf);
        when(remoteAddress.equals(Mockito.any(SocketAddress.class))).thenReturn(true);

        // Act and Assert
        assertEquals(null, Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}