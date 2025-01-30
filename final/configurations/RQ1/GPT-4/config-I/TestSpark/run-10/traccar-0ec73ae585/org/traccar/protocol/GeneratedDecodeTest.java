package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.PositionManager;
import org.traccar.network.NetworkManager;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class GeneratedDecodeTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

    @Test
    public void decodeTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        ByteBuf msg = Unpooled.copiedBuffer("3G*3305880002*00B2*UD2,DHJ,160812235757,A,23.131262,113.382374,0.00,158.00,5.00,4,80.00,49%,,1,1,460,01,1707,19594,,460,01,1707,15490,,,80,0C6,00,460,1,2,0,55,0,62,11100000,302DE51F,,0;", StandardCharsets.US_ASCII);

        Position result = (Position) decoder.decode(channel, remoteAddress, msg);

        assertNotNull(result);
        assertEquals(23.131262, result.getLatitude(), 1e-6);
        assertEquals(113.382374, result.getLongitude(), 1e-6);
    }

}