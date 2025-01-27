package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
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
public class GeneratedTest {

    @Mock
    private Channel channel;

    @Mock
    private DeviceSession session;

    @InjectMocks
    private GalileoProtocolDecoder decoder;

    @Test
    public void decode[]

    Test() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        decoder.decode(channel, (SocketAddress) null, msg);
    }

    @Test
    public void decode[]

    Test_withEmptyBuffer() throws Exception {
        ByteBuf buf = Unpooled.buffer(0);
        NetworkMessage msg = new NetworkMessage();
        decoder.decode(channel, (SocketAddress) null, msg);
    }

    @Test
    public void decode[]

    Test_withInvalidProtocol() throws Exception {
        Protocol protocol = new Protocol("invalid");
        decoder = new GalileoProtocolDecoder(protocol);
        assert decoder == null;
    }

    @Test
    public void decode[]

    Test_withNullChannel() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        Channel channelNull = null;
        decoder.decode(channelNull, (SocketAddress) null, msg);
    }

    @Test
    public void decode[]

    Test_withEmptyMessage() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        Channel channel = this.channel;
        decoder.decode(channel, (SocketAddress) null, msg);
    }

    @Test
    public void decode[]

    Test_withNonEmptyMessage() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        Channel channel = this.channel;
        decoder.decode(channel, (SocketAddress) null, msg);
    }

    @Test
    public void decode[]

    Test_withNonEmptyChannel() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        Channel channel = this.channel;
        decoder.decode(channel, (SocketAddress) null, msg);
    }

    @Test
    public void decode[]

    Test_withInvalidSession() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        Channel channel = this.channel;
        DeviceSession sessionNull = null;
        decoder.decode(channel, (SocketAddress) null, sessionNull, msg);
    }

    @Test
    public void decode[]

    Test_withValidSession() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        Channel channel = this.channel;
        DeviceSession session = this.session;
        decoder.decode(channel, (SocketAddress) null, session, msg);
    }

    @Test
    public void decode[]

    Test_withPosition() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        Channel channel = this.channel;
        DeviceSession session = this.session;
        Position position = new Position();
        decoder.decode(channel, (SocketAddress) null, session, msg);
    }

    @Test
    public void decode[]

    Test_withPositionAndTime() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer(10, StandardCharsets.UTF_8);
        NetworkMessage msg = new NetworkMessage();
        Channel channel = this.channel;
        DeviceSession session = this.session;
        Position position = new Position();
        Calendar time = Calendar.getInstance();
        decoder.decode(channel, (SocketAddress) null, session, msg);
    }

}