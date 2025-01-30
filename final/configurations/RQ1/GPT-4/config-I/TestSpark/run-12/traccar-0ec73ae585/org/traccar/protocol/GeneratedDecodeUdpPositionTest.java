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
public class GeneratedDecodeUdpPositionTest {

    @Test
    public void decodeUdpPositionTest() throws Exception {
        SocketAddress remoteAddress = new InetSocketAddress(InetAddress.getByName("192.168.1.1"), 5000);
        DeviceSession deviceSession = new DeviceSession("123", "123");
        Protocol protocol = new Protocol("");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.wrappedBuffer(
                ByteBufUtil.decodeHexDump("5B33332A313030333031323335322A30303035425B38352A313030333031323335322A303030422C2A33312C392323232323234E2C3232303230322E353735382C4540202F2E2F2D0123323A00003F0D0A"));
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(remoteAddress);

        Position position = (Position) decoder.decode(channel, remoteAddress, buf);

        assertNotNull(position);
        assertEquals(22.340263, position.getLongitude(), 0);
        assertEquals(30.402837, position.getLatitude(), 0);
    }

}