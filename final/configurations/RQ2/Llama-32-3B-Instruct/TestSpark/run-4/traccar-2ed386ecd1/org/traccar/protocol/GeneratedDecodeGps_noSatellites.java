package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedDecodeGps_noSatellites {

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
    public void decodeGps_noSatellites() {
        // Arrange
        when(buf.readByte()).thenReturn((byte) 0x01);
        when(buf.readByte()).thenReturn((byte) 0x02);

        // Act and Assert
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, null));
    }

}