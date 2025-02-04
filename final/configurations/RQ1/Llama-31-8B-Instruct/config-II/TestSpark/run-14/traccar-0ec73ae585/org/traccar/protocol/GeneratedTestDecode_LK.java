package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecode_LK {

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void testDecode_LK() {
        ByteBuf buf = Unpooled.buffer(10);
        buf.writeByte('[');
        buf.writeBytes("AB".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte('*');
        buf.writeBytes("LK".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte('*');
        buf.writeByte(']');
        decoder.decode(channel, remoteAddress, buf);
        decoder.sendResponse(channel, "AB", null, "LK");
    }

}