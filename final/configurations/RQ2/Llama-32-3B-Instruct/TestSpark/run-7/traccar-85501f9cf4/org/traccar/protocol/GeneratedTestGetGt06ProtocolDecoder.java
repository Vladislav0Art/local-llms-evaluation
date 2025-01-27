package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.Locale;

public class GeneratedTestGetGt06ProtocolDecoder {

    @Test
    public void testGetGt06ProtocolDecoder() throws IOException {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Object message = decoder.decode(new Channel(), new SocketAddress("127.0.0.1", 1234), null);
        System.out.println(message);
    }

}