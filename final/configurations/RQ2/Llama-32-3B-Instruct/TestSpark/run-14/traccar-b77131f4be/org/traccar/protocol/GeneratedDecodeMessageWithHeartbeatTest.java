package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeMessageWithHeartbeatTest {

    @Mock
    private Channel channel;

    @Mock
    private DeviceSession deviceSession;

    @InjectMocks
    private GalileoProtocolDecoder galileoProtocolDecoder;

    @Test
    public void decodeMessageWithHeartbeatTest() {
        Mockito.when(channel.id()).thenReturn(0L);
        Mockito.when(deviceSession.getProtocol()).thenReturn(new Protocol("heartbeat"));

        Object result = galileoProtocolDecoder.decode(channel, null, null);

        assert result != null;
    }

}