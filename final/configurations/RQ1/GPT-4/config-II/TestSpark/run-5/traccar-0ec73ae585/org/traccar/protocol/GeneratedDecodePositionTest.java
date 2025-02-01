package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedDecodePositionTest {

    private WatchProtocolDecoder decoder =
            new WatchProtocolDecoder(Protocol.getInstance("WATCH", "watch", null));

    @Test
    public void decodePositionTest() {
        String dataToParse = "130220092036,V,25.050928,N,55.222261,E,1.00,10.10,2.00,10,50,100,1000,xfa5a,2,2,425,02,3375,1234,50,32014,2304,30,1,DemoWifi,001122334455,30";
        Position position;
        position = decoder.decodePosition(ParserTest.getDeviceSession(), dataToParse);
        Assert.assertTrue(position.getDeviceId() > 0);
    }

}