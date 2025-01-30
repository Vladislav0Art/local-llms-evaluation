package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.DeviceSession;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionDataTest {

    private final SocketAddress remoteAddress = new InetSocketAddress(5555);

    @Test
    public void decodePositionDataTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

        Channel channel = mock(Channel.class);

        when(channel.writeAndFlush(any())).thenReturn(null);

        ByteBuf buf = Unpooled.copiedBuffer("[3G*9711111174*00E6*UD," +
                        "230114,110436,A,22.589526,N,113.870716,E,0.00,0.0,6,100,100,1000,0,0,90000000,Battery=,,FFFF$]",
                StandardCharsets.US_ASCII);

        decoder.decode(channel, remoteAddress, buf);

        Position position = decoder.getPositions().get(0);

        assertNotNull(position);
        assertEquals("9711111174", position.getDeviceId());
        assertEquals(UnitsConverter.knotsFromKph(0.0), position.getSpeed(), 0.01);
        assertEquals(0.0, position.getCourse(), 0.01);
        assertEquals(22.589526, position.getLatitude(), 0.01);
        assertEquals(113.870716, position.getLongitude(), 0.01);
    }

}