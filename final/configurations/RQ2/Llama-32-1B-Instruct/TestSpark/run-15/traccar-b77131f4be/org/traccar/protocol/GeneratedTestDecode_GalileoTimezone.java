package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecode_GalileoTimezone {

    @Test
    public void testDecode_GalileoTimezone() {
        // Arrange
        TimeZone timezone = ZoneId.of("GMT");
        Mockito.when(TimeZone.encode()).thenReturn(timezone);

        // Act
        Object msg = decoder.decode(
                Mockito.mock(Channel.class),
                Mockito.mock(SocketAddress.class),
                Mockito.mock(NetworkMessage.class)
        );

        // Assert
        assertEquals(ZoneId.of("GMT"), (TimeZone) msg);
    }

}