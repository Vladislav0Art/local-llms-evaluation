package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTagPositionKeyDeviceTempTest {

    @Mock
    private Protocol protocol;

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

    @Test
    public void decodeTagPositionKeyDeviceTempTest() {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{0x43, 20});
        Position position = new Position();

        try {
            decoder.decode(channel, remoteAddress, buf);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(20, position.getInteger(Position.KEY_DEVICE_TEMP).intValue());
    }

}