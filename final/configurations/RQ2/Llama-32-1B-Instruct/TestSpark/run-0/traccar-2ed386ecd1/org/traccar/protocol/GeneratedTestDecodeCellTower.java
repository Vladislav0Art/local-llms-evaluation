package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestDecodeCellTower {

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