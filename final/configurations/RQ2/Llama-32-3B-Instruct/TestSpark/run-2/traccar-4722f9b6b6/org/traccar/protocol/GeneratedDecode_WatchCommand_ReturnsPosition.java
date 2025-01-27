package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.model.Position;
import org.traccar.model.CellTower;

public class GeneratedDecode_WatchCommand_ReturnsPosition {

    @Test
    public void decode_WatchCommand_ReturnsPosition() throws Exception {
        // Arrange
        byte[] data = {0x00, 0x01, 0x02, 0x03};
        Protocol protocol = new Protocol("Watch");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position position = new Position(1.0, 2.0, 3.0);

        // Act
        Object result = decoder.decode(null, null, data);

        // Assert
        assertTrue(result instanceof Position);
        assertEquals(position, (Position) result);
    }

}