package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_PositionTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private GalileoProtocolDecoder decoder;

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

}