package org.traccar.protocol;

import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidDataTest {

    @Test
    public void decodeValidDataTest() throws Exception {
        // Prepare data for testing
        String requiredMsg = "$$1111,540,a,1,10,1,1,158989555,77079050,339,12749665664,N,54,141299,812000,9,4";
        ByteBuf buf = Unpooled.copiedBuffer(requiredMsg, StandardCharsets.US_ASCII);

        // Mock required objects
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Protocol protocol = new Protocol("galileo") { ...
        };

        // Create instance of class under test
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        // Run method under test
        Position data = (Position) decoder.decode(channel, remoteAddress, buf);

        // Verify results
        assertNotNull("Decoded data should not be null", data);
        assertEquals("Position ID should match", 1111, data.getDeviceId());
        assertEquals("Expect latitude", 54.0, data.getLatitude(), 0.001);
        assertEquals("Expect longitude", 77.079050, data.getLongitude(), 0.001);
    }

}