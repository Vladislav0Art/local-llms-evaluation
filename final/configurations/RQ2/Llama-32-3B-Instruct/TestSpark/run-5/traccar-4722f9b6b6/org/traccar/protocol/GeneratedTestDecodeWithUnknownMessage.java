package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
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
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeWithUnknownMessage {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    private WatchProtocolDecoder decoder;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        decoder = new WatchProtocolDecoder(new Protocol());
    }

    @Test
    public void testDecodeWithUnknownMessage() throws Exception {
        setup();
        byte[] data = BufferUtil.encode(new Network(), new Date());
        ByteBuf expected = Unpooled.copiedBuffer(data);
        Network network = new Network();
        decoder.decode(channel, remoteAddress, network);
        Pattern pattern = new PatternBuilder().build();
        UnitsConverter converter = new UnitsConverter();
        Position position = (Position) parser.parse(pattern);
        assert position == null;
    }

}