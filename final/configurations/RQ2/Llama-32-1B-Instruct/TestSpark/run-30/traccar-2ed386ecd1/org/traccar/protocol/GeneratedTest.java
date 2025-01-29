package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private CellTower cellTower;

    @Test
    public void testDecodeGpsPosition() {
        // Given
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Position);
    }

    @Test
    public void testDecodeGpsCellTower() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(cellTower, buf, false, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof CellTower);
    }

    @Test
    public void testDecodeGpsNetwork() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(new Position(37.7749, -122.4194), buf, false, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Network);
    }

    @Test
    public void testDecodeNetworkPosition() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeNetwork(new Position(37.7749, -122.4194), buf, false, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Position);
    }

    @Test
    public void testDecodeGpsChecksum() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(new Position(37.7749, -122.4194), buf, false, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Network);
    }

    @Test
    public void testDecodeGpstrmPosition() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(new Position(37.7749, -122.4194), buf, true, false, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Position);
    }

    @Test
    public void testDecodeGpstrmCellTower() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(cellTower, buf, true, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof CellTower);
    }

    @Test
    public void testDecodeGpstrmNetwork() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(new Position(37.7749, -122.4194), buf, true, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Network);
    }

    @Test
    public void testDecodeGpstrmPositionChecksum() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(new Position(37.7749, -122.4194), buf, true, false, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Network);
    }

    @Test
    public void testDecodeGpstrmCellTowerChecksum() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(cellTower, buf, true, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof CellTower);
    }

    @Test
    public void testDecodeGpstrmNetworkChecksum() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(new Position(37.7749, -122.4194), buf, true, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Network);
    }

}