package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

public class GeneratedTestDecode_GalileoProtocol_MappedPosition {

    @Test
    public void testDecode_GalileoProtocol_MappedPosition() {
        // Arrange
        String scenario = "test_decode_galileo_protocol_mapped_position";
        Protocol protocol = Mockito.mock(Protocol.class);
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        // Act
        Object decodedMsg = decoder.decode("galileo", null, null);

        // Assert
        assertEquals("Galileo protocol message", (String) decodedMsg);
    }

}