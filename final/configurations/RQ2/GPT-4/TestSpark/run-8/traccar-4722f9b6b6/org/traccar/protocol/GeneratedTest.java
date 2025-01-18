package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Command;

import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    private final InetSocketAddress address = new InetSocketAddress(50000);
    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(
            new Protocol() {
                @Override
                public void sendTextCommand(String deviceId, Command command) {
                    // No implementation needed for this test
                }

                @Override
                public Set<String> getSupportedTextCommands() {
                    return Collections.emptySet();
                }
            });

}