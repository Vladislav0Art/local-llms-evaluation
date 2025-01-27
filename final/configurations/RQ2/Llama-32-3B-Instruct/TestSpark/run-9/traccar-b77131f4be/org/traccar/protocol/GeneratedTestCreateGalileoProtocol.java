package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;

public class GeneratedTestCreateGalileoProtocol {

    @Test
    public void testCreateGalileoProtocol() {
        assertDoesNotThrow(() -> new GalileoProtocol());
    }

    public static class GalileoProtocolDecoder {
        private Protocol protocol;

        public GalileoProtocolDecoder(Protocol protocol) {
            this.protocol = protocol;
        }

        public Object decode(String message, String param1, String param2) throws Exception {
            return protocol.decode(message);
        }
    }

}