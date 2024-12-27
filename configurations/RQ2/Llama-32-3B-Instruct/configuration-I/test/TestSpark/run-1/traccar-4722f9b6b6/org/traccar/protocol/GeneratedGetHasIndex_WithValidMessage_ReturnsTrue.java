package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.traccar.protocol.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.model.Message;
import org.traccar.model.Device;
import org.traccar.model.Channel;
import org.traccar.model.SocketAddress;
import org.mockito.Mockito;

public class GeneratedGetHasIndex_WithValidMessage_ReturnsTrue {

    @Test
    public void getHasIndex_WithValidMessage_ReturnsTrue() {
        Message message = new Message("message", Arrays.asList("key"));
        assertTrue(WatchProtocolDecoder.getHasIndex(message));
    }

}