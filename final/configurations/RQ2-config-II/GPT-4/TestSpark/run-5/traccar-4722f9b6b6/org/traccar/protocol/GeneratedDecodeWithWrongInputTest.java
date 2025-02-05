package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedDecodeWithWrongInputTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeWithWrongInputTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        try {
            Position result = (Position) decoder.decode(channel, remoteAddress, "[SG*8800000015*0004*LK][WRONG_INPUT]");
            Assert.assertNull(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}