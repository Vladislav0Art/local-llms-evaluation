package org.traccar.protocol;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Command;

import static org.junit.Assert.assertNotNull;

public class GeneratedDecodeImgTest {

    @Test
    public void decodeImgTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

        ChannelBuffer buffer = ChannelBuffers.copiedBuffer("[3G*123456789012345*0002*img]", StandardCharsets.US_ASCII);
        Channel channel = new TestIdentityManager.MockChannel(true);

        assertNotNull(decoder.decode(channel, null, buffer));
    }

}