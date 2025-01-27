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

public class GeneratedGetHasIndex_WatchProtocolDecoder_HasIndex {

    @Test
    public void getHasIndex_WatchProtocolDecoder_HasIndex() {
        // [MethodUnderTest][Scenario]Test
        Protocol protocol = new MockProtocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean result = decoder.getHasIndex();
        assertTrue(result);
    }

}