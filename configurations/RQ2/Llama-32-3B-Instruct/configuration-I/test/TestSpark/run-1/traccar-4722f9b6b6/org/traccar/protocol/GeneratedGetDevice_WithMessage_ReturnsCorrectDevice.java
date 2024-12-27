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

public class GeneratedGetDevice_WithMessage_ReturnsCorrectDevice {

    @Test
    public void getDevice_WithMessage_ReturnsCorrectDevice() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Message message = new Message("message", Arrays.asList("device"));
        Device device = WatchProtocolDecoder.getDevice(message);
        assertNotNull(device);
    }

}