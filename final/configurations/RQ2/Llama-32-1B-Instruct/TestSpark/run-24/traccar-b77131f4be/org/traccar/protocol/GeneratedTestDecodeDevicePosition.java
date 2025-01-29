package org.traccar.protocol;

public class GeneratedTestDecodeDevicePosition {

    @Test
    public void testDecodeDevicePosition() {
        // Arrange
        Position position = new Position(1, 2, 3);
        Map<String, String> sessionInfo = new HashMap<>();
        sessionInfo.put("id", "test");
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        // Act
        ByteBuf buf = new Unpooled();
        decoder.decode(channel, remoteAddress, position);
    }

}