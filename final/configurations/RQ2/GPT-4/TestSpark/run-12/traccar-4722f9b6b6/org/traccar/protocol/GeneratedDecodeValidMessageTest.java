package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidMessageTest {

    WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void decodeValidMessageTest() throws Exception {
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Channel channel = mock(Channel.class);
        // Assuming we have a valid GPS data string
        String validGpsData = "[3G*7800000207*00FA*LK,221122,00,83089,45]";
        Position position = (Position) decoder.decode(channel, remoteAddress, validGpsData);
        assertNotNull(position);
        assertEquals(45.83089, position.getLongitude(), 0.001);
    }

}