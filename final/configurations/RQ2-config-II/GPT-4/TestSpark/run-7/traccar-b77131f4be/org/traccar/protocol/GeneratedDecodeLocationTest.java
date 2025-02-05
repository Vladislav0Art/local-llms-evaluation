package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

public class GeneratedDecodeLocationTest {

    @Test
    public void decodeLocationTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo_protocol_decoder_test") {
            @Override
            protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
                return super.decode(channel, remoteAddress, msg);
            }
        });

        // Mocking channel
        Channel channel = Mockito.mock(Channel.class);

        // Creating remoteAddress
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 80);

        // Creating protocol message
        String msg = "<A>22,1,1234567890,+45.1234,-100.1234</A>";

        // Decode message
        Position position = (Position) decoder.decode(channel, remoteAddress, msg);

        // Validate fields
        Assert.assertEquals(position.getDeviceId(), 1);
        Assert.assertEquals(position.getLatitude(), 45.1234, 1e-5);
        Assert.assertEquals(position.getLongitude(), -100.1234, 1e-5);
    }

}