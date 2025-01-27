package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Calendar;

public class GeneratedTestDecode {

    @Test
    public void testDecode() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        assertEquals("expected", decoder.decode(
                Channel.getChannel(), SocketAddress.getSocketAddress(),
                "message"));
    }

}