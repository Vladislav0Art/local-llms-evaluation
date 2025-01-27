package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.BaseProtocolDecoder;
import org.traccar.Command;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecode_WatchResponse_ReturnsInstance {

    @Test
    public void decode_WatchResponse_ReturnsInstance() throws Exception {
        // [MethodUnderTest][Scenario]Test
        Protocol protocol = new MockProtocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(null, null, null);
        assertNotNull(result);
    }

}