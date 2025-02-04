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
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecode_INIT {

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void testDecode_INIT() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte('[');
        buf.writeBytes("AB".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte('*');
        buf.writeBytes("INIT".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte('*');
        buf.writeByte('1');
        buf.writeByte('*');
        buf.writeByte(']');
        NetworkMessage message = new NetworkMessage(buf, remoteAddress);
        Object result = decoder.decode(channel, remoteAddress, message);
        assertNull(result);
        verify(channel).writeAndFlush(any(NetworkMessage.class));
    }

}