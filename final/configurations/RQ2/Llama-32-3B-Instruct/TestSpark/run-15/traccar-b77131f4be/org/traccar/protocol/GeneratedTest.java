package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private GalileoProtocolDecoder decoder;

    @Test
    public void decode_StandardResponseTest() throws Exception {
        // Arrange
        ByteBuf buffer = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        String payload = "payload";
        byte[] response = new byte[]{1, 2, 3};
        Mockito.when(channel.readBytes()).thenReturn(buffer);

        // Act
        Object msg = decoder.decode(channel, remoteAddress, null);
        BitBuffer bitBuffer = new BitBuffer(response, StandardCharsets.UTF_8);

        // Assert
        assert (msg instanceof NetworkMessage);
    }

    @Test
    public void decode_PositionTest() throws Exception {
        // Arrange
        ByteBuf buffer = Unpooled.copiedBuffer(20, StandardCharsets.UTF_8);
        String payload = "payload";
        byte[] response = new byte[]{4, 5, 6};
        Mockito.when(channel.readBytes()).thenReturn(buffer);

        // Act
        Object msg = decoder.decode(channel, remoteAddress, null);
        Position position = (Position) msg;

        // Assert
        assert (position != null && position.getLat() > 0.0 && position.getLon() > 0.0);
    }

    @Test
    public void decode_DeviceInfoTest() throws Exception {
        // Arrange
        ByteBuf buffer = Unpooled.copiedBuffer(30, StandardCharsets.UTF_8);
        String payload = "payload";
        byte[] response = new byte[]{7, 8, 9};
        Mockito.when(channel.readBytes()).thenReturn(buffer);

        // Act
        Object msg = decoder.decode(channel, remoteAddress, null);
        DeviceSession deviceSession = (DeviceSession) msg;

        // Assert
        assert (deviceSession != null && deviceSession.getMac() > 0L);
    }

    @Test
    public void decode_InvalidResponseTest() throws Exception {
        // Arrange
        ByteBuf buffer = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);

        // Act and Assert
        assertThrows(Exception.class, () -> decoder.decode(channel, remoteAddress, null));
    }

    @Test
    public void decode_NullResponseTest() throws Exception {
        // Arrange
        ByteBuf buffer = Unpooled.copiedBuffer(0, StandardCharsets.UTF_8);

        // Act and Assert
        assertThrows(Exception.class, () -> decoder.decode(channel, remoteAddress, null));
    }

}