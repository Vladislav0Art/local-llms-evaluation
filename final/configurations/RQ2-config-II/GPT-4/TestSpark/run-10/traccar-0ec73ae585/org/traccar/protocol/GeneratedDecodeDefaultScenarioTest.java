package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.StringProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeDefaultScenarioTest {

    @Test
    public void decodeDefaultScenarioTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol(""));
        Position position = new Position();
        Object actual = watchProtocolDecoder.decode(channel, remoteAddress, position);
        assertEquals(new NetworkMessage("[3G*7000000000*00A*LEN,41007,50374351,ZK,U1,R1,26,V,1,1,1,1,2,1,1,1,12,3F,334,01,2173,4411,47,2173,20451,34,2173,20449,30,2173,20439,29,2173,20442,24,2173,5411,24,2173,20387,16,2173,20395,15,2173,20437,11]", remoteAddress), actual);
    }

}