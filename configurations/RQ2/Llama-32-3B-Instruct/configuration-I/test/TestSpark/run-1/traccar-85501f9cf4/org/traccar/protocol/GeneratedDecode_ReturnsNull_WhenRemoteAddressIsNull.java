package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedDecode_ReturnsNull_WhenRemoteAddressIsNull {

    @Test
    public void decode_ReturnsNull_WhenRemoteAddressIsNull() {
        Channel channel = new Channel();
        SocketAddress remoteAddress = null;
        Object msg = new Object();
        assertNull(Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}