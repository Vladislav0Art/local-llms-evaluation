package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void testDecodeGpsPosition() throws Exception {
        // Arrange
        byte[] expected = new byte[54];
        BufferUtil.writeByte(expected, 0);
        BufferUtil.writeByte(expected, 2);
        Position position = new Position();
        position.setId(123L);
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        // Act
        boolean hasLength = true;
        TimeZone timezone = TimeZone.UTC;

        Gt06ProtocolDecoder.Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Object result = decoder.decodeGpsPosition(position, expected, hasLength, timezone);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void testDecodeGt06ProtocolPacket() throws Exception {
        // Arrange
        byte[] buffer = new byte[1000];
        for (int i = 2; i < buffer.length; i++) {
            BufferUtil.writeByte(buffer, i);
        }
        Position position = new Position();
        position.setId(123L);
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        // Act
        boolean hasLength = true;
        TimeZone timezone = TimeZone.UTC;

        Gt06ProtocolDecoder.Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Object result = decoder.decodeGt06ProtocolPacket(position, buffer, hasLength, timezone);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void testDecodePositionFromMessage() throws Exception {
        // Arrange
        byte[] message = new byte[50];
        BufferUtil.writeByte(message, 0);
        Position position = new Position();
        position.setId(123L);
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        // Act
        Object result = Gt06ProtocolDecoder.Gt06ProtocolDecoder.decodePositionFromMessage(message, position);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        // Arrange
        byte[] message = new byte[1000];
        BufferUtil.writeByte(message, 0);
        Network network = new Network();
        network.setId(123L);
        network.setLatitude(37.7749);
        network.setLongitude(-122.4194);

        // Act
        Object result = Gt06ProtocolDecoder.Gt06ProtocolDecoder.decodeNetworkMessage(message, network);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void testDecodeCellTower() throws Exception {
        // Arrange
        byte[] message = new byte[50];
        BufferUtil.writeByte(message, 0);
        CellTower cellTower = new CellTower();
        cellTower.setId(123L);
        cellTower.setLatitude(37.7749);
        cellTower.setLongitude(-122.4194);

        // Act
        Object result = Gt06ProtocolDecoder.Gt06ProtocolDecoder.decodeCellTower(message, cellTower);

        // Assert
        assertNotNull(result);
    }

}