package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import static org.junit.Assert.*;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("test") {
        };
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = watchProtocolDecoder.getHasIndex();
        assertFalse(hasIndex);
    }

}