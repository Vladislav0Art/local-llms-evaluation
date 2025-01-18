package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Command;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedGetHasIndexDefaultTest {

    private final InetSocketAddress address = new InetSocketAddress(50000);
    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(
            new Protocol() {
                @Override
                public void sendTextCommand(String deviceId, Command command) {
                    // No implementation needed for this test
                }
            });

    @Test
    public void getHasIndexDefaultTest() {
        boolean result = decoder.getHasIndex();
        assertEquals(false, result);
    }

}