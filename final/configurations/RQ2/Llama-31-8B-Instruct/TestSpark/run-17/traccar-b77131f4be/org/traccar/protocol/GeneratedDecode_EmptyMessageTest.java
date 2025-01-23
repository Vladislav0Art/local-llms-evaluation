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

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_EmptyMessageTest {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @InjectMocks
    private GalileoProtocolDecoder decoder;

    @Test
    public void decode_EmptyMessageTest() {
        ByteBuf buffer = Unpooled.buffer(0);
        try {
            assertNull(decoder.decode(null, null, buffer));
        } catch (Exception e) {
            // Ignore
        }
    }

}