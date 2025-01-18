package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Command;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeNullMessageTest {

    private final InetSocketAddress address = new InetSocketAddress(50000);
    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(
            new Protocol() {
                @Override
                public void sendTextCommand(String deviceId, Command command) {
                    // No implementation needed for this test
                }
            });

    @Test
    public void decodeNullMessageTest() throws Exception {
        Channel channel = mock(Channel.class);
        Object result = decoder.decode(channel, address, null);
        assertEquals(null, result);
    }

}