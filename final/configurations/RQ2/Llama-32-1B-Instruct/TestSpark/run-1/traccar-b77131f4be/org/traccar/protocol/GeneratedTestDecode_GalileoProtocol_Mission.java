package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

public class GeneratedTestDecode_GalileoProtocol_Mission {

    @Test
    public void testDecode_GalileoProtocol_Mission() {
        // Arrange
        String scenario = "test_decode_galileo_protocol_mission";
        Protocol protocol = Mockito.mock(Protocol.class);
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        // Act
        Object decodedMsg = decoder.decode("galileo", null, null);

        // Assert
        assertEquals("Galileo protocol message", (String) decodedMsg);
    }

}