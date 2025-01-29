package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeNoTimezone {

    @Test
    public void testDecodeNoTimezone() {
        // Arrange
        Position position = new Position();
        Mockito.when(BcdUtil.encode(position)).thenReturn(new byte[]{1, 2, 3});

        ByteBuf buf = Mockito.mock(ByteBuf.class);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        // Act
        Object result = Gt06ProtocolDecoder.decodeGps(position, buf, false, null, null, TimeZone.getDefault());

        // Assert
        assertEquals(3, BcdUtil.decodeByte(buf).length());
    }

}