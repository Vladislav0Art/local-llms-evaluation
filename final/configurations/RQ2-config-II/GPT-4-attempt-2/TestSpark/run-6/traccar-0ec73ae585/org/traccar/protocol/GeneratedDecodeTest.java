package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import static org.junit.Assert.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = new Protocol("test") {
        };
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Channel mockChannel = Mockito.mock(Channel.class);
        Mockito.when(mockChannel.remoteAddress()).thenReturn(null);
        String msg = "some message";
        Object result = watchProtocolDecoder.decode(mockChannel, null, msg);
        assertNull(result);
    }

}