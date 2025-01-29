package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeBitUtilString {

    @Test
    public void testDecodeBitUtilString() throws Exception {
        // Arrange
        Protocol protocol = mock(Protocol.class);
        String[] args = {"string"};
        BitUtil bitUtil = new BitUtil();
        SocketAddress address = mock(SocketAddress.class);

        // Act
        Object result = GalileoProtocolDecoder.decode("192.168.1.9", args, address, bitUtil);

        // Assert
        assertEquals(bitUtil.toString(), (String) result);
    }

}