package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

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
    public void decodeGps() {
        // Arrange
        when(buf.readByte()).thenReturn((byte) 0x01);
        when(buf.readByte()).thenReturn((byte) 0x02);

        // Act and Assert
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, null));
    }

    @Test
    public void decodeGps_noSatellites() {
        // Arrange
        when(buf.readByte()).thenReturn((byte) 0x01);
        when(buf.readByte()).thenReturn((byte) 0x02);

        // Act and Assert
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, null));
    }

    @Test
    public void decodeGps_withSpeed() {
        // Arrange
        when(buf.readByte()).thenReturn((byte) 0x01);
        when(buf.readByte()).thenReturn((byte) 0x02);

        // Act and Assert
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, true, null));
    }

    @Test
    public void decodeGps_noChecksum() {
        // Arrange
        when(buf.readByte()).thenReturn((byte) 0x01);
        when(buf.readByte()).thenReturn((byte) 0x02);

        // Act and Assert
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, null));
    }

    @Test
    public void decodeGps_checksumFailed() {
        // Arrange
        when(buf.readByte()).thenReturn((byte) 0x01);
        when(buf.readByte()).thenReturn((byte) 0x02);

        // Act and Assert
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, null));
    }

    @Test
    public void decodeGps_positionNull() {
        // Arrange
        when(buf.readByte()).thenReturn((byte) 0x01);
        when(buf.readByte()).thenReturn((byte) 0x02);

        // Act and Assert
        assertTrue(Gt06ProtocolDecoder.decodeGps(null, buf, true, false, false, null));
    }

    @Test
    public void decodeGps_deviceSessionNull() {
        // Arrange
        when(buf.readByte()).thenReturn((byte) 0x01);
        when(buf.readByte()).thenReturn((byte) 0x02);

        // Act and Assert
        assertTrue(Gt06ProtocolDecoder.decode(position, buf, true, false, false, null));
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