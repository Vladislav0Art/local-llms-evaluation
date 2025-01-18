package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithValidMsgContainingDeviceTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeWithValidMsgContainingDeviceTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("testProtocol"));
        String testMsg = "12345,48.8577,2.295,0";

        Object result = decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(testMsg.getBytes()));
        assertNotNull(result);
        Position position = (Position) result;

        DeviceSession deviceSession = position.getDeviceSession();
        assertNotNull(deviceSession);
        assertEquals("12345", deviceSession.getDeviceId());
    }

}