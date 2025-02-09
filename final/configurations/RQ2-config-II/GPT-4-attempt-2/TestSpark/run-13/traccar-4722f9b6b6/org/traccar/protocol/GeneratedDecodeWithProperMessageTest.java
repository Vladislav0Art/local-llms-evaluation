package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedDecodeWithProperMessageTest {

    @Test
    public void decodeWithProperMessageTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);

        String msg = "869867030492481,LK,161945,A,22.648368,113.803408,40,2,0,00000010,100,460,0,7928,10429,0,,6,100,95,31,460|0|5FEA|5F54,460|0|5FEA|73CA,460|0|5FEA|7210,460|0|5FEA|5F55,460|0|5FEA|5F53,460|0|5FEA|517F";

        Position result = (Position) decoder.decode(channel, address, msg);

        Assert.assertNotNull(result);
    }

}