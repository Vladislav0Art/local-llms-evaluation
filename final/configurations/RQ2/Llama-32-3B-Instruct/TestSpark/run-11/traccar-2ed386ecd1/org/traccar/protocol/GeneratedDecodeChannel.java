package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Calendar;

public class GeneratedDecodeChannel {

    @Test
    public void decodeChannel() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        assertNotNull(decoder.decode(
                Channel.getChannel(), SocketAddress.getSocketAddress(),
                null));
    }

}