package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        // Arrange
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        boolean hasIndex = decoder.getHasIndex(remoteAddress, protocol);

        // Assert
        verify(protocol).getHasIndex(hasIndex);
    }

}