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

public class GeneratedDecode_WithEmptyMessage_ReturnsUnknown {

    @Test
    public void decode_WithEmptyMessage_ReturnsUnknown() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Message message = new Message("", Arrays.asList("key"));
        Object result = WatchProtocolDecoder.decode(channel, remoteAddress, message);
        assertEquals("unknown", result.toString());
    }

}