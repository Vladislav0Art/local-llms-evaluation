package org.traccar.protocol;

public class GeneratedTestDecode Channel {

    @Test
    public void testDecode

    Channel() throws Exception {
        // Arrange
        Channel channel = new Channel();
        Protocol protocol = new Protocol();

        // Act
        Object message = decoder.decode(channel, null, null);

        // Assert
        assertEquals(protocol, (Protocol) message);
    }

}