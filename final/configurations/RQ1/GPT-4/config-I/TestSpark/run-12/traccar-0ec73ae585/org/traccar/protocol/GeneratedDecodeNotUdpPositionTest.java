package org.traccar.protocol;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNotUdpPositionTest {

    @Test
    public void decodeNotUdpPositionTest() throws Exception {
        SocketAddress remoteAddress = new InetSocketAddress(InetAddress.getByName("192.168.1.1"), 5000);
        DeviceSession deviceSession = new DeviceSession("123", "123");
        Protocol protocol = new Protocol("");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.wrappedBuffer(
                ByteBufUtil.decodeHexDump("23352A313030333031323335322A313030333031323335322C6766733B3323342C313030333031323335322A30303034232331313034302C35333531382C302C302C302C3023"));
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(remoteAddress);

        Position position = (Position) decoder.decode(channel, remoteAddress, buf);

        assertNull(position);
    }

}