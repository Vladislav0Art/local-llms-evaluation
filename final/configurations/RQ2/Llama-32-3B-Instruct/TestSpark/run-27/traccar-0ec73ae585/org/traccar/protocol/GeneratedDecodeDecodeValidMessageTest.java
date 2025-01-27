package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.BaseProtocolDecoder;
import org.traccar.helper.BitUtil;
import org.traccar.helper.BufferUtil;
import org.traccar.helper.Parser;
import org.traccar.helper.PatternBuilder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;
import org.traccar.session.Session;
import org.traccar.util.Base64Parser;
import org.traccar.util.DateUtil;
import org.traccar.util.Time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeDecodeValidMessageTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Session session;

    @Mock
    private Channel channel;

    private WatchProtocolDecoderDecoder decoder = new WatchProtocolDecoder();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(deviceSession.getProtocol()).thenReturn(WatchProtocolProtocol.class);
    }

    @Test
    public void decodeDecodeValidMessageTest() throws Exception {
        when(channel.pipeline()).thenReturn(new io.netty.channel.ChannelPipeline());
        when(channel.pipeline().writeAndFlush(any())).thenAnswer(i -> i.invoke(null));

        byte[] bytes = "watch protocol message".getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(bytes.length);
        buf.writeBytes(bytes);

        Network network = new Network();
        Position position = new Position();
        network.setCellTower(new CellTower());
        network.setPosition(position);

        decoder.decode(channel, deviceSession, network);

        Mockito.verify(channel.pipeline()).writeAndFlush(eq(network));
    }

}