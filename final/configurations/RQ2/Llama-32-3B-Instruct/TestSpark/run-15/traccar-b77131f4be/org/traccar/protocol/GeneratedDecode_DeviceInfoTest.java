package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_DeviceInfoTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private GalileoProtocolDecoder decoder;

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

}