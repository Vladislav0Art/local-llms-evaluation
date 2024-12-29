package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.traccar.model.Device;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeNullMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object message = decoder.decode(channel, remoteAddress, null);

        assertEquals(null, message);
    }

    @Test
    public void decodeBlankMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object message = decoder.decode(channel, remoteAddress, "");

        assertEquals(null, message);
    }

    @Test
    public void decodeValidMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        String testMsg = "your-valid-test-message-here";
        Object message = decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(testMsg, StandardCharsets.UTF_8));

        assertNotNull(message);
    }

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        String testMsg = "invalid-message";
        Object message = decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(testMsg, StandardCharsets.UTF_8));

        assertEquals(null, message);
    }

}