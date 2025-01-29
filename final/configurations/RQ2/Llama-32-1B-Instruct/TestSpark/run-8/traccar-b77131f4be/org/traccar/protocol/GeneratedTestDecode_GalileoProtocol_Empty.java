package org.traccar.protocol;

public class GeneratedTestDecode_GalileoProtocol_Empty {

    @Test
    public void testDecode_GalileoProtocol_Empty() {
        // Arrange
        Protocol protocol = new Protocol();

        // Act
        Object decodedObject = decode(channel, remoteAddress, null);

        // Assert
        assertNull(decodedObject);
    }

}