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

public class GeneratedDecode_WildcardWatchRequest_ReturnsNull {

    @Test
    public void decode_WildcardWatchRequest_ReturnsNull() throws Exception {
        // [MethodUnderTest][Scenario]Test
        Protocol protocol = new MockProtocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(null, null, null);
        assertNull(result);
    }
}

class Command {
}

class MockProtocol implements Protocol {

    @Override
    public void sendTextCommand(String command, Command cmd) {
    }

    @Override
    public String getSupportedTextCommands() {
        return "";
    }

    @Override
    public boolean isWatchRequest() {
        return true;
    }

    @Override
    public void sendDataCommand(Command cmd, String data) {
    }

    @Override
    public void init() {
    }

}