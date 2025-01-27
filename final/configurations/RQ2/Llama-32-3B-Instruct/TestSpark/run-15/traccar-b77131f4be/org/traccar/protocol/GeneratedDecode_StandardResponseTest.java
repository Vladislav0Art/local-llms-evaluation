package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_StandardResponseTest {

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

}