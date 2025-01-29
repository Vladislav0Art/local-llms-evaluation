package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    private final Protocol protocol = new Protocol();
    private final Position position = new Position(0, 0, Calendar.getInstance());

    @Test
    public void testDecode_GalileoProtocol_General() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_Devices() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(DevicesProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(DevicesProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_Sensors() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(SensorsProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(SensorsProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessage() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        // Act
        Object result = decode(channel, remoteAddress, null);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_BadRequest() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(BAD_REQUEST.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(BAD_REQUEST.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_NilMessage() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, null);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_EmptyMessage() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, "");

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_GalileoVersionString() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_GalileoVersionNumber() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessageAndNotInGalileoVersion() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_GalileoVersionNumberZero() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessageAndNotInGalileoVersionZero() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_GalileoVersionNumberOne() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_GalileoVersionNumberTwo() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessageAndNotInGalileoVersionTwo() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_GalileoVersionNumberThree() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessageAndNotInGalileoVersionThree() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_GalileoVersionNumberFour() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessageAndNotInGalileoVersionFour() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessageAndNotInGalileoVersionFive() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessageAndNotInGalileoVersionSix() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

    @Test
    public void testDecode_GalileoProtocol_HasNoMessageAndNotInGalileoVersionZeroAndOne() throws Exception {
        // Arrange
        when(protocol.getProtocol()).thenReturn(GalileoProtocol.class);

        // Act
        Object result = decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(GalileoProtocol.decode, ((Object) result).getClass());
    }

}