package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeEmptyMessageTest {

    @Test
    public void decodeEmptyMessageTest() {
        Protocol mockProtocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mockProtocol);
        Channel mockChannel = mock(Channel.class);
        InetSocketAddress dummyAddress = new InetSocketAddress("localhost", 1234);

        Object result = decoder.decode(mockChannel, dummyAddress, "");
        assert (result == null);
    }

}