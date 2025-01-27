package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDecodePositionHasCoordinates {

    @Test
    public void decodePositionHasCoordinates() throws Exception {
        Map<String, Object> parameters = new HashMap<>();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object message = new byte[]{0x01, 0x02, 0x03};

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(Protocol.GALILEO);
        Position position = (Position) decoder.decode(channel, remoteAddress, message);
        assertNotNull(position);
        assertTrue(position.getLongitude() != null && position.getLatitude() != null);
    }

}