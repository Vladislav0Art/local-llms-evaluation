package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeTestInvalidMsgType {

    Protocol protocol = new Protocol("testProtocol");

    @Test
    public void decodeTestInvalidMsgType() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(null, null, "WrongType"));
    }

}