package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import static org.junit.Assert.*;

public class GeneratedWatchProtocolDecoderConstructorTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("test") {
        };
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        assertNotNull(watchProtocolDecoder);
    }

}