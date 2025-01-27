package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.Locale;

public class GeneratedTestGetTraccarProtocolDecoder {

    @Test
    public void testGetTraccarProtocolDecoder() throws IOException {
        TraccarProtocolDecoder decoder = new TraccarProtocolDecoder();
        Object message = decoder.decode(new Channel(), new SocketAddress("127.0.0.1", 1234), null);
        System.out.println(message);
    }

}