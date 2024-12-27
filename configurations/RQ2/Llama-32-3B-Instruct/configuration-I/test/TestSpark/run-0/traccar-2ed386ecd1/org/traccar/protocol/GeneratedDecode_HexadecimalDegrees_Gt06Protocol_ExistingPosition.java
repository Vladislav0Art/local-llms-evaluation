package org.traccar.protocol;

public class GeneratedDecode_HexadecimalDegrees_Gt06Protocol_ExistingPosition {

    @Test
    public void decode_HexadecimalDegrees_Gt06Protocol_ExistingPosition() {
        // Arrange
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new Position(0x12, 0x34);

        // Act and Assert
        when(channel.getRemoteSocketAddress()).thenReturn(remoteAddress);
        when(remoteAddress.getAddress()).thenReturn("127.0.0.1");
        assertTrue(Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}