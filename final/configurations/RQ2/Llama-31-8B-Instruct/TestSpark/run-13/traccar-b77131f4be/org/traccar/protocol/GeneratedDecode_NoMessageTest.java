package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_NoMessageTest {

    @Mock
    private Protocol protocol;

    @Mock
    private io.netty.channel.Channel channel;

    @Mock
    private java.net.SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @InjectMocks
    private GalileoProtocolDecoder decoder;

    @Test
    public void decode_NoMessageTest() {
        try {
            assertNull(decoder.decode(channel, remoteAddress, null));
        } catch (Exception e) {
            // ignore
        }
    }

}