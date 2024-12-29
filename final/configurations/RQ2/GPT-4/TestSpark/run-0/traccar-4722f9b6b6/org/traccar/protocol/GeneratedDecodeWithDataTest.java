package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.Context;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithDataTest {

    @Test
    public void decodeWithDataTest() throws Exception {
        Context.init(Mockito.mock(Config.class));
        Protocol protocol = new WatchProtocolDecoder(new Protocol("foo"));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);

        Object o = "A message";
        Object decoded = decoder.decode(channel, address, o);
        assertNotNull(decoded);
    }

}