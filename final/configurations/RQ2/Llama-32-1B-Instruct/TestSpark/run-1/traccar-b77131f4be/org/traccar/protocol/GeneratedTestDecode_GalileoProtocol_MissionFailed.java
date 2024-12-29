package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

public class GeneratedTestDecode_GalileoProtocol_MissionFailed {

    @Test
    public void testDecode_GalileoProtocol_MissionFailed() {
        // Arrange
        String scenario = "test_decode_galileo_protocol_mission_failed";
        Protocol protocol = Mockito.mock(Protocol.class);
        BaseProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        // Act
        Object decodedMsg = decoder.decode("galileo", null, null);

        // Assert
        assertEquals("Galileo protocol message", (String) decodedMsg);
    }

}